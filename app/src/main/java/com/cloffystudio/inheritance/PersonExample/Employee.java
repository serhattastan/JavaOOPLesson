package com.cloffystudio.inheritance.PersonExample;

// Alt Sınıf
public class Employee extends Person {
    private String jobTitle;
    private double salary;

    // Getter ve Setter metotları
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) { // Validation
            this.salary = salary;
        } else {
            System.out.println("Maaş negatif olamaz!");
        }
    }

    // Alt sınıfa özel bir metot
    public void displayJobDetails() {
        System.out.println("Meslek: " + jobTitle + ", Maaş: " + salary);
    }

    // Üst sınıfın metodu Override ediliyor
    @Override
    public void displayInfo() {
        super.displayInfo(); // Üst sınıfın metodu
        displayJobDetails(); // Alt sınıfa özel metodun çağrılması
    }
}
