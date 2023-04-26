package Seminar3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample2 {
    private static Random random = new Random();


    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман", "Денис", "Артем", "Роман", "Андрей", "Михаил"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов", "Холдов", "Павлюшин", "Самойлов", "Пинаев"};
        int workerType = random.nextInt(2);

        int salary = random.nextInt(900, 1500);
        int rate_hour = 1200;
        int hours = random.nextInt(50);
        int salaryFreeLance =  hours * rate_hour;
        int salaryIndex = random.nextInt(28, 31);
        switch (workerType) {
            case 0:
                return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * salaryIndex);

            case 1:
                return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], salaryFreeLance );

        }

        return null;
    }

    public static void main(String[] args) {


        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println("\n*** Отсортированный массив сотрудников ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}

    class SalaryComparator implements Comparator<Employee> {


        @Override
        public int compare(Employee o1, Employee o2) {

            return Double.compare(o2.calculateSalary(), o1.calculateSalary());

        }
    }

    class SurNameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {

            return o1.surName.compareTo(o2.surName);
        }


    }
class age implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
    }
}


    abstract class Employee implements Comparable<Employee> {

        protected String firstName;
        protected String surName;
        protected double salary;
        protected int age;

        public Employee(String firstName, String surName, double salary) {
            this.firstName = firstName;
            this.surName = surName;
            this.salary = salary;
        }

        public abstract double calculateSalary();

        @Override
        public String toString() {
            return String.format("Сотрудник: %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                    surName, firstName, salary, calculateSalary());
        }

        @Override
        public int compareTo(Employee o) {
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
    }

     class Worker extends Employee {

        public Worker(String firstName, String surName, double salary) {
            super(firstName, surName, salary);
        }

        @Override
        public double calculateSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f",
                    surName, firstName, calculateSalary());


        }
    }

    class Freelancer extends Employee {
        public Freelancer(String firstName, String surName, double salary) {
            super(firstName, surName, salary);
        }



        @Override
        public double calculateSalary() {
            return salary;
        }

        public String toString() {
            return String.format("%s %s; Фриланс; Среднемесячная заработная плата: %.2f",
                    surName, firstName, calculateSalary());
        }

    }





