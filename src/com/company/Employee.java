package com.company;

public class Employee {
    public String name;
    public String surname;
    public String e_mail;
    public int phoneNumber;
    public int age;
    public int salary;

    public Employee(String name, String surname, String e_mail, int phoneNumber, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.e_mail = e_mail;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return  String.format("Трудяга %s %s c электронной почтой %s. Ему %d, зарабтывает %d рублей.\nВы можете позвонить ему по номеру %d.", name, surname, e_mail, age, salary, phoneNumber);
    }

}
