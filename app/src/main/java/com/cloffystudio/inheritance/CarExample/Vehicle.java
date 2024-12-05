package com.cloffystudio.inheritance.CarExample;

// Üst Sınıf - Ata Sınıf - Super Class
//Bu sınıf bir üst sınıftır. Genelde bu sınıfın nesnesi oluşturulup kullanılmaz.
//Bu sınıfın genel amacı bağlantılı sınıflardaki ortak özellikleri taşımak ve gerektiğinde ilgili sınıflara iletmektir.
//Sınıflarımızı ilgi derecelerine göre alt ve üst sınıflara ayırmak kod-proje-algoritma yönetilebilirliği açısından çok önemlidir. Bunu ilerleyen zamanlarda tecrübe ederek deneyimleyeceksiniz.
public class Vehicle {
    // Encapsulation: Özellikler private.

    //Bu nesne bir üst sınıf olduğu için burada Constructor yapısını kullanmadık. Eğer bu sınıftan bir nesne tanımlanmak istenirse Constructor tanımlayabilirsiniz.
    // Constructor tanımlamadan da get ve set metodlarını kullanarak veriileri atayabilirsizniz.
    private String brand;
    private int speed;

    // Getter ve Setter metotları.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    //Hızın negatif girilememesi için kontrol ederek set metodunu oluşturuyoruz.
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Hız negatif olamaz!");
        }
    }

    // Nesne içindeki değerleri yazdırmak için bir metod tanımlıyoruz.
    public void displayInfo() {
        System.out.println("Marka: " + brand + ", Hız: " + speed + " km/s");
    }
}
