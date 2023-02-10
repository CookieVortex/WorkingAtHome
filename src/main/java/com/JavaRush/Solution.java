package com.JavaRush;

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance = balance - Integer.parseInt(bill);
    }

    public static class Programmer {
        private int salary = 1000;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
            if (salary > this.salary) {
                this.salary = salary;
            }
        }
    }

    public static class Car {
        private String model;
        private int year;
        private String color;

        public void initialize(int year, String model, String color) {
            this.model = model;
            this.year = year;
            this.color = color;
        }
    }

    public class Solutions {

        public static void main(String[] args) {
            Planet earth = new Planet();
            earth.name = "Земля";
            earth.age = 4_540_000_000L;
            earth.speed = 170_218;
            earth.area = 510_072_000;
            earth.printInformation();
        }
    }

    public class Solutionse {
        public static void main(String[] args) {
            Cat cat = new TomCat();

            boolean isCat = cat instanceof Cat;
            boolean isMovable = cat instanceof CanMove;
            boolean isTom = cat instanceof TomCat;

            if (isCat && isMovable && isTom) System.out.println("Bingo!");
        }

        interface CanMove {
        }

        static class Cat implements CanMove {
        }

        static class TomCat extends Cat {

        }
    }
}

