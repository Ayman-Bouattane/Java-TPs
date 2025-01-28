package Internship_Management_Project;

public abstract class Student {
    private String firstName;
    private String familyName;

    public Student(String name, String familyName) {
        this.firstName = name;
        this.familyName = familyName;
    }

    public abstract void displayInfo();

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }
}