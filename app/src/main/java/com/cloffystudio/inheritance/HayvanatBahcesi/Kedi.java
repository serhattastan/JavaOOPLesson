package com.cloffystudio.inheritance.HayvanatBahcesi;

public class Kedi extends Hayvan{
    public Kedi(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void sesCikar(){
        System.out.println("Miyav");
        System.out.println(super.getIsim() + " Miyavladı UwU");
    }
}
