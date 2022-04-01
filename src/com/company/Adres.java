package com.company;

public class Adres {
    private String projivanie;
    private String adres;

    public Adres(String adres, String projivanie) {
        this.adres = adres;
        this.projivanie = projivanie;
    }

    public Adres() {

    }

    public String getProjivanie() {
        return projivanie;
    }

    public void setProjivanie(String projivanie) {
        this.projivanie = projivanie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}

