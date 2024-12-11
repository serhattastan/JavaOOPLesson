package com.cloffystudio.inheritance.HayvanatBahcesi;

public class Aslan extends Hayvan{
    public Aslan(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void sesCikar(){
        System.out.println("Roar!");
        System.out.println(super.getIsim() + " Kükredi!!!");
    }
}
