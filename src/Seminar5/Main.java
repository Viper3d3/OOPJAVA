package Seminar5;

import Seminar5.models.TableModel;
import Seminar5.presenters.BookingPresenter;
import Seminar5.view.BookingView;

public class Main {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model,view);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();
        bookingPresenter.updateReservationTableStatus(2);

    }
}
