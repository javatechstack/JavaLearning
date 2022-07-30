package com.javatechstack.app.classandobject;

//Class is a template - used to create multiple objects (or instances)
public class Mobile {

    //Instance variables
    String brand;
    float size;
    String model;

    //Main method to start the execution
    public static void main(String[] args) {
        Mobile object1 = new Mobile(); // new keyword is used to create object of Mobile class.
        // assign values to instance variables of object1
        object1.brand = "IPHONE";
        object1.size = 6.5f;
        object1.model = "13 PRO MAX";

        Mobile object2 = new Mobile();
        // assign values to instance variables of object2
        object2.brand = "SAMSUNG";
        object2.size = 6.5f;
        object2.model = "S20PLUS";

        System.out.println("Welcome to JavaTechStack!!");

        //print object variables. (variables are accessed using {objectName}.{variableName})
        System.out.println("OBJECT1 - " + object1.brand + " " + object1.model + " " + object1.size);
        System.out.println("OBJECT2 - " + object2.brand + " " + object2.model + " " + object2.size);
    }
}