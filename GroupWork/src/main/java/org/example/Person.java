package org.example;

public class Person {

    String name;
    int age;
    String geschlecht;

    public Person(String name, int age, String geschlecht) {
        this.name = name;
        this.age = age;
        this.geschlecht = geschlecht;
    }

    public void intro() {
        System.out.println("Hallo, ich bin " + name + " und " + age + " Jahre alt.");
    }
}
