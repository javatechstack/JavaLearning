package com.javatechstack.app.createclassconditions;

//When class is declared public, Class name should be matched with filename.
//Also, a public class should have main method in it.
//A java file can have only one public class.
public class Student {
    String name;

    public void welcomeStudent() {
        System.out.println("Inside welcomeStudent()");
    }

    public static void main(String[] args) {
        System.out.println("I am in Student class - Main Method");
        Student studentObj = new Student(); // it creates student class object

        studentObj.name = "Sam"; //assigning value to name variable
        //Calling welcomeStudent() method
        studentObj.welcomeStudent();
    }
}

//A java file can contain multiple classes in it but only one class should be public.
// Multiple classes can have main method in the same java file.
class Teacher {
    String name;

    public void welcomeTeacher() {
        System.out.println("Inside welcomeTeacher()");
    }

    public static void main(String[] args) {
        System.out.println("I am in Teacher class - Main Method");
        Teacher teacherObj = new Teacher(); // it creates teacher class object

        teacherObj.name = "Ram"; //assigning value to name variable
        //Calling welcomeTeacher() method
        teacherObj.welcomeTeacher();
    }
}
