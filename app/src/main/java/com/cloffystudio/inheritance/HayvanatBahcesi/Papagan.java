package com.cloffystudio.inheritance.HayvanatBahcesi;

public class Papagan extends Hayvan{
    public Papagan(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void sesCikar(){
        System.out.println("Babacık Babacık Cicikuş");
        System.out.println(super.getIsim() + " Konuştu :)");
    }
}
