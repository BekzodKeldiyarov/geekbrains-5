package com.bekzodkeldiyarov.geekbrains;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    public Person(String fullName, String position, String email, String phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInformation() {
        System.out.printf("Имя Сотрудника: %s%nПозиция: %s%nЭлектронная почта: %s%nНомер телефона: %s%nЗарплата: %f%nВозраст: %d%n", fullName, position, email, phoneNumber, salary, age);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }



    // test github
}
