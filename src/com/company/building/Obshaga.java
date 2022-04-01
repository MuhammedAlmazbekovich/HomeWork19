package com.company.building;

import com.company.Adres;
import com.company.Family;

import java.util.Arrays;

public class Obshaga extends Adres {
    Family[] families;

    public Obshaga(Family[] families ,String projivanie , String adres){
        super(adres, projivanie);
    }

    public Obshaga() {
        super();

    }

    @Override
    public String toString() {
        return "Уй булоо " + getProjivanie() +" "+  getAdres() + " " + "жашайт" +" "+ Arrays.toString(families);
    }
}
