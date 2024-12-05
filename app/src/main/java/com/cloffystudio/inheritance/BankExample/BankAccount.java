package com.cloffystudio.inheritance.BankExample;

public class BankAccount {
    // Encapsulation: Özellikleri private tutarak sınıfımızı daha güvenilir ve yönetilebilir hale getiriyoruz.
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor: Hesap oluştururken gerekli bilgileri alıyoruz ve değerlerimizin içini dolduruyoruz.
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        //Bakiye için girilen değerin negatif olmamasını sağlıyoruz.
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Başlangıç bakiyesi negatif olamaz!");
            this.balance = 0;
        }

    }

    // Getter ve Setter metotları ile tuttuğumuz verileri çekebiliyoruz ve üzerlerinde değişiklikler yapabiliyoruz.
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Para yatırma işlemi için bir metod tanımlıyoruz.
    public void deposit(double amount) {
        //Eğer yatırılan değer yani fonksiyon parametresi 0 dan küçükse kullanıcıya bir hata mesajı gösteriyoruz. Değer uygun ise para yatırma işlemini gerçekleştiriyoruz.
        //Kodumuzda mantıksal hata yapmamaya özen göstermek zorundayız ve bu gibi durumları kontrol altına almayı ertelememeliyiz.
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + balance + " TL");
        } else {
            //Kullanıcıya veya geliştiriciye girdiği değerin hatalı olduğunu bildiriyoruz.
            System.out.println("Yatırılacak tutar pozitif olmalı!");
        }
    }

    // Para çekme işleminin kontrollerini gerçekleştiriyoruz.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " TL çekildi. Kalan bakiye: " + balance + " TL");
        } else if (amount > balance) {
            System.out.println("Yetersiz bakiye!");
        } else {
            System.out.println("Çekilecek tutar pozitif olmalı!");
        }
    }
}