package com.company.influence;

public interface Payable {

    default void rentPay() {
        System.out.println("Общежитие менен гостиницада жашагандар аренда толошот ");

    }

    default void  publicUtilities () {
        System.out.println("Квартирада жашагандар ком услуга толошот");

    }
}
