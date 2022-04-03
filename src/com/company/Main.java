package com.company;

public class Main {
    //Employee[] employee = new Employee[5];
    //employee[0]= new Employee("Гоща", "Южный","gosha@thebest.com", 123456789, 29,70000);


    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Гоща", "Южный","gosha@thebest.com", 111113333, 29,70000);
        employee[1] = new Employee("Павел", "Хомяков", "humsterowner@mail.com", 111222333,19, 28000);
        employee[2] = new Employee("Клим", "Ворошилов", "climm@outlook.com", 789456789,42, 55000);
        employee[3] = new Employee("Алена", "Прекрасная", "beautygirl@thebest.com", 444555666, 56, 120000);
        employee[4] = new Employee("Кирилл", "Тестовый", "test@test.com", 125789635, 44, 45000);
        //System.out.println(employee[0]);

        for (Employee man : employee) {
            if (man.age > 40) System.out.println(man);
        }
        // write your code here
    }


}
