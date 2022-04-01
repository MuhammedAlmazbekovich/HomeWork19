package com.company;

import com.company.building.Gostinica;
import com.company.building.Kvartira;
import com.company.building.Obshaga;

public class Main {

    public static void main(String[] args) {
        Person father1 = new Person("Kurmanbek", 36);
        Person mother1 = new Person("Nadejda",34);
        Person son1 = new Person("Maksim", 14);

        Family family1 = new Family(new Person[] {father1, mother1, son1});


        Person father2 = new Person("Almaz", 55 );
        Person mother2 = new Person("Raisa",  47);
        Person daughter2 = new Person("Aliya",  20);

        Family family2 = new Family(new Person[] {father2, mother2, daughter2});


        Person father3 = new Person("Sadyr", 58);
        Person mother3 = new Person("Aygul", 50);
        Person son3 = new Person("Nurbek", 25);

        Family family3 = new Family(new Person[] {father3, mother3,son3});


        Adres obshaga = new Obshaga(new Family[]{family1},"Obshaga","Bishkek");
        Adres kvartira = new Kvartira(new Family[]{family2},"Kvartira","Osh");
        Adres gostinica = new Gostinica(new Family[]{family3},"Gostinica","Batken");

        family1.live();
        System.out.println(obshaga);
        family1.publicUtilities();


        System.out.println(kvartira);
        family2.live();
        family2.rentPay();

        family3.live();
        System.out.println(gostinica);
        family3.rentPay();










    }
}
