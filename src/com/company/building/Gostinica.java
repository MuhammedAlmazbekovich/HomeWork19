package com.company.building;

import com.company.Adres;
import com.company.Family;

import java.util.Arrays;

public class Gostinica extends Adres {
    Family[] families;
    public Gostinica(Family[] families ,String projivanie , String adres){
        super(adres, projivanie);
    }

    @Override
    public String toString() {
        return "Уй булоо " + getProjivanie() +" "+  getAdres() + " " + "жашайт" +" "+ Arrays.toString(families);
    }
}
