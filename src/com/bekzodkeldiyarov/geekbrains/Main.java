package com.bekzodkeldiyarov.geekbrains;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Фирсов Александр Константинович", "Актриса", "ivan@mtagdalt6@bizimalem-support.de", "1234567", 453424, 65);

        person[1] = new Person("Герасимова София Григорьевна", "Нейрохирург", "yaseerroma7d@helpman.ml", "1234567", 432423, 12);
        person[2] = new Person("Царева Агния Максимовна", "Геолог", "6ziyadbahlouln@rendenacolori.com", "1234567", 142354, 94);
        person[3] = new Person("Лебедев Михаил Маркович", "Прокурор", "have@cupremplus.com", "1234567", 123120, 78);
        person[4] = new Person("Воронин Лука Артёмович", "Охранник", "msaimi.rajpootf@adaov.com", "1234567", 5345, 19);

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].getInformation();
                System.out.println("------------------------------");
            }
        }
    }
}
