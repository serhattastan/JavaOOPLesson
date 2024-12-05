package com.cloffystudio.inheritance.CarExample;

// Alt Sınıf - Çocuk Sınıf - Child Class
//Bu sınıf bir üst sınıfın özellikleri ile birlikte kendi özelliklerine de sahiptir. ÜSt sınıfta tanımlanan verileri, fonksiyonları içerir ve kullanabilir.
public class Car extends Vehicle {
    private int doorCount; // Otomobile özgü özellik

    //Tercihe göre constructor tanımlanabilir. Şuan konuyu yeni işlediğimiz için kafa karışıklığı yaşamamanız adına bu tanımlamayı yapmıyopruz.

    // Getter ve Setter metotları
    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        if (doorCount > 0) { // Kapı sayısı sıfırdan büyük olmalı
            this.doorCount = doorCount;
        } else {
            System.out.println("Kapı sayısı sıfırdan büyük olmalı!");
        }
    }

    // Alt sınıfa özgü bir metot
    public void displayCarInfo() {
        displayInfo(); // Üst sınıfta oluşturduğumuz metod. Bu metodu sanki bu class içinde tanımlamışız gibi çağırabilmemizin sebebi bu sınıfın Vechile sınıfının alt sınıfı olmasıdır. (Üst sınıftaki verileri okumamızı sağlıyor.)
        System.out.println("Kapı Sayısı: " + doorCount);
    }
}
