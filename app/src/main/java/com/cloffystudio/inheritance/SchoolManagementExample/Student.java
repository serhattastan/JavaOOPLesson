package com.cloffystudio.inheritance.SchoolManagementExample;

public class Student {
    // Encapsulation: Özellikler private
    private String name;
    private int age;
    private double grade;


    //Constructor kullanarak nesne oluşturulduğunda değerlerin atandığından emin oluyoruz.
    public Student(String name, int age, double grade) {
        this.name = name;
        setAge(age);
        setGrade(grade);
    }

    // Getter ve Setter metotları ile nesne oluşturulduktan sonra atadığımız değerlere hem erişiyoruz hem de değerlerde değişiklik yapabiliyoruz.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //Burada kullanıcı yaşının değer atanırken 0 dan küçük olmamasını sağlıyoruz.
    public void setAge(int age) {
        if (age > 0 && age <= 120) { // Geçerli yaş aralığı
            this.age = age;
        } else {
            System.out.println("Geçersiz yaş girildi! Yaş 0 ile 120 arasında olmalıdır.");
            this.age = 0; // Hatalı giriş durumunda varsayılan değer atanıyor
        }
    }

    public double getGrade() {
        return grade;
    }

    //Not değerlerinin istediğimiz gibi girildiğinden emin oluyoruz.
    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) { // Not aralığı: 0-100
            this.grade = grade;
        } else {
            System.out.println("Geçersiz not girildi! Not 0 ile 100 arasında olmalıdır.");
            this.grade = 0.0; // Hatalı giriş durumunda varsayılan değer atanıyor
        }
    }

    // Öğrenci bilgilerini toplu bir şekilde yazdırmak için bir metod tanımlıyoruz.
    public void displayStudentInfo() {
        System.out.println("Ad: " + name);
        //Burada ternary operator (üçlü operatör) olarak bilinen bir yöntemi kullanarak uzun bir şekilde if-else yapısı içine girmeden yazdırmak istediğimiz değerlerin uygun koşullarda olup olmadığını kontrol ediyporuz.
        System.out.println("Yaş: " + (age > 0 ? age : "Geçersiz"));
        System.out.println("Not: " + (grade >= 0.0 ? grade : "Geçersiz"));
    }
}
