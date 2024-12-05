package com.cloffystudio.inheritance.PersonExample;

// Üst Sınıf
public class Person {
    // Encapsulation: Özellikler private
    private String name;
    private int age;

    // Getter ve Setter metotları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Yaş sıfırdan büyük olmalı!");
        }
    }

    // Genel bir metot
    public void displayInfo() {
        System.out.println("Ad: " + name + ", Yaş: " + age);
    }
}
