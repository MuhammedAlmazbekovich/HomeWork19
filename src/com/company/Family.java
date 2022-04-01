package com.company;

import com.company.influence.Liveable;
import com.company.influence.Payable;

import java.util.Arrays;

public class Family implements Liveable, Payable {
    Person[] person;

    public Family(Person[] person) {
        this.person = person;
    }

    public Family() {
    }


    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Family{" +
                "person=" + Arrays.toString(person) +
                '}';
    }

    @Override
    public void live() {

    }

    @Override
    public void rentPay() {
        Payable.super.rentPay();
    }

    @Override
    public void publicUtilities() {
        Payable.super.publicUtilities();
    }
}
