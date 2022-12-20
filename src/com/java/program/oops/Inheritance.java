package com.java.program.oops;

class Bank {

    public String name;
    int id;

    public void interest() {
        System.out.println("Bank class interest method called " + name);
    }

    public void demo() {
        System.out.println("Bank demo method called, id value is " + id);
    }
}

class HDFC extends Bank {
    String interestRate;
    int amount;
    public String name;

    public void interest() {
        System.out.println("HDFC class interest method called " + name);
    }

    public void display() {
        System.out.println("HDFC display method called");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        /**
         * Its implicit
         * Upcasting, left = Parent, right = Child
         * 
         * During upcasting we can able to access only parent class memebers. We cannot
         * access child class members until unless if any other overriden methods
         * available in child class
         * 
         */
        Bank bank = new HDFC();
        bank.id = 10;
        bank.name = "naresh";
        bank.demo();
        bank.interest(); // This method overriden in child class, but name varaible will not be inherited
                         // from parent class

        /**
         * 
         */

        // HDFC hdfc = new Bank(); It will throw compilation error, downcasting is
        // explicit

        HDFC hdfc = (HDFC) bank;

        hdfc.interestRate = "10";
        hdfc.id = 10;
        hdfc.name = "naresh";

        hdfc.interest();
        hdfc.display();
        hdfc.demo();

    }

}
