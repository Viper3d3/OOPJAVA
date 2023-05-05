package Seminar5.models;


import Seminar5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;


    /**
     * Получение списка всех столиков
     *
     * @return столики
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationDate Дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Невозможно забронировать столик.");
    }


    //TODO: Разработать самостоятельно в рамках домашней работы
    public boolean changeReservationTable(int reservationId, int newTableNo) {
        for (Table table : tables) {
            if (table.getNo() == newTableNo) { // проверяем, что новый столик существует
                for (Reservation reservation : table.getReservations()) { // проверяем, что новый столик свободен на нужную дату
                    if (reservation.getId() == reservationId) {
                        Date reservationDate = reservation.getDate();
                        for (Table oldTable : tables) { // находим столик, на котором была сделана бронь
                            for (Reservation oldReservation : oldTable.getReservations()) {
                                if (oldReservation.getId() == reservationId) { // удаляем существующую бронь
                                    oldTable.getReservations().remove(oldReservation);
// создаем новую бронь для нового столика
                                    Reservation newReservation = new Reservation(reservationDate, oldReservation.getName());
                                    table.getReservations().add(newReservation);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false; // если не удалось выполнить изменение брони
    }

}