package OOPSPart1;

import OOPSPart1.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//       This give error bcz make is a private variable
//        System.out.println("make"+make);

//        USING Setters, now the value set in the main class for variables can be updated.
        car.setMake("Nano");
        car.setColor("Red");
        car.setModel("ERTY 66");
        car.setDoors(2);
        car.setConvertible(true);

//        calling getter methods
        System.out.println("make  : " + car.getMake());
        System.out.println("model  : " + car.getModel());
        System.out.println("colour : " + car.getColor());
        System.out.println("doors  : " + car.getDoors());
        System.out.println("convertible : " + car.isConvertible());
        car.describeCar();


        Car obj=new Car();
        obj.setMake("Book");
        obj.setColor("White");
        obj.setModel("Not applicable");
        obj.setDoors(0);
        obj.setConvertible(false);
        obj.describeCar();

    }
}