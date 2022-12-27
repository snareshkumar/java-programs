package com.java.program.designpatterns;

interface Bank {
    public void interest();
}

class HDFC implements Bank {
    @Override
    public void interest() {
        System.out.println("HDFC Bank interest method called");
    }
}

class SBI implements Bank {
    @Override
    public void interest() {
        System.out.println("SBI Bank interest method called");
    }
}

class IDBI implements Bank {
    @Override
    public void interest() {
        System.out.println("IDBI Bank interest method called");
    }
}

class FactoryCreator {

    public Bank getFactoryObject(String bankType) {

        if (bankType.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        if (bankType.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        }
        if (bankType.equalsIgnoreCase("IDBI")) {
            return new IDBI();
        }

        return null;

    }

}

public class FactoryPattern {

    public static void main(String[] args) {
        FactoryCreator creator = new FactoryCreator();

        Bank hdfcBank = creator.getFactoryObject("HDFC");
        hdfcBank.interest();

        Bank sbiBank = creator.getFactoryObject("SBI");
        sbiBank.interest();

    }

}
