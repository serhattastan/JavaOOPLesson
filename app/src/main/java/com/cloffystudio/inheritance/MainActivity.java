package com.cloffystudio.inheritance;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cloffystudio.inheritance.AskerOrnek.Tankci;
import com.cloffystudio.inheritance.BankExample.BankAccount;
import com.cloffystudio.inheritance.CarExample.Car;
import com.cloffystudio.inheritance.HayvanatBahcesi.Aslan;
import com.cloffystudio.inheritance.HayvanatBahcesi.Hayvan;
import com.cloffystudio.inheritance.HayvanatBahcesi.Kedi;
import com.cloffystudio.inheritance.HayvanatBahcesi.Papagan;
import com.cloffystudio.inheritance.PersonExample.Employee;
import com.cloffystudio.inheritance.SchoolManagementExample.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        //****************************Bank Account Example - Encapsulation***********************//
//
//        // BankAccount isimli sınıfımızın türünde account isimli bir nesne-object oluşturuyoruz. Constructor kullanarak bu nesnenin içinde tuttuğumuz değerlere veri girişini yapıyoruz.
//        BankAccount account = new BankAccount("12345678", "Kadife Külyutmaz", 500);
//
//        // Hesap bilgilerini sınıfımızın içinde tanımladığımız Getter metodlarını kullanarak çekip log kaydı olarak yazdırıyoruz.
//        System.out.println("Hesap Numarası: " + account.getAccountNumber());
//        System.out.println("Hesap Sahibi: " + account.getAccountHolderName());
//        System.out.println("Bakiye: " + account.getBalance() + " TL");
//
//        // Sınıfımız içinde oluşturduğumuz para çekme ve yatırma işlemlerini simüle ediyoruz.
//        account.deposit(200);
//        account.withdraw(100);
//        account.withdraw(700); // Yetersiz bakiye örneği
//
//        //****************************School Management System - Encapsulation***********************//
//
//        // Student isimli Class türünde bir nesne (object) oluşturuyoruz. Class içinde oluşturduğumuz constructor (yapıcı metod) aracılığıyla parantez içinde değerlerimizi vererek bu işlemi tek seferde kolay bir şekilde tamamlayabiliyoruz.
//        Student student1 = new Student("Ahmet", 20, 85.5);
//        //Oluşturduğumuz öğrenci nesnesinin özelliklerini daha önce oluşturduğumuz displayStudentInfo metodu aracılığıyla tek seferde log kaydı olarak yazdırıyoruz.
//        student1.displayStudentInfo();
//
//        System.out.println();
//
//        // Hatalı bilgilerle yeni bir öğrenci oluşturuyoruz
//        Student student2 = new Student("Ayşe", -5, 150.0); // Geçersiz yaş ve not
//        student2.displayStudentInfo();
//
//        //Boş log kaydı
//        System.out.println("*****");
//
//        // Daha önce hatalı olarak girdiğimiz değerleri daha önce oluşturduğumuz Setter metodlarını kullanrak kolayca düzeltiyoruz.
//        student2.setAge(25);
//        student2.setGrade(90.0);
//        student2.displayStudentInfo();

//        //****************************Employee Example***********************//
//
//        // Employee nesnesi oluşturuluyor
//        Employee emp = new Employee();
//
//        // Encapsulation ile değerler atanıyor
//        emp.setName("Serhat");
//        emp.setAge(25);
//        emp.setJobTitle("Android Developer");
//        emp.setSalary(12000);
//
//        // Bilgiler görüntüleniyor
//        emp.displayInfo();
//
//        //****************************Car Example***********************//
//
//        // Car nesnesi oluşturuluyor
//        Car car = new Car();
//
//        // Encapsulation ile değerler atanıyor
//        car.setBrand("Toyota");
//        car.setSpeed(120);
//        car.setDoorCount(4);
//
//        // Bilgiler görüntüleniyor
//        car.displayCarInfo();


        //        //****************************Asker Ornek***********************//
//
//        Tankci tankci = new Tankci();
//        tankci.atesEt();

        Hayvan aslan = new Aslan("Aslan Leo", 12);
        Hayvan kedi = new Kedi("Pişi", 1);
        Papagan papagan = new Papagan("Boncuk", 3);

        aslan.sesCikar();
        kedi.sesCikar();
        papagan.sesCikar();


    }
}