package com.java.program.oops;

final class ImmutableClass {
    private final int idNumber;
    private final String name;
    private final String place;

    public ImmutableClass(int idNumber, String name, String place) {
        this.idNumber = idNumber;
        this.name = name;
        this.place = place;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

}

public class ImmutableDemo {
    public static void main(String[] args) {

        ImmutableClass immutableClass = new ImmutableClass(5, "naresh", "chennai");

        System.out.println("Accessing id number is " + immutableClass.getIdNumber());
        System.out.println("Accessing name value is " + immutableClass.getName());

        ImmutableClass newObject = immutableClass; // Cannot be modified

    }

}
