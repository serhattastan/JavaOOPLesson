package com.cloffystudio.inheritance.HayvanatBahcesi;

public class Hayvan {
    private String isim;
    private int yas;

    public Hayvan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void sesCikar(){
        System.out.println("Hayvan ses çıkardı.");
    }


}
