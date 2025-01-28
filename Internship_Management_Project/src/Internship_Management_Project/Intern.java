package Internship_Management_Project;

public class Intern extends Student {
    private String studyLevel;

    public Intern(String firstname, String familyName, String studyLevel) {
        super(firstname, familyName);
        this.studyLevel = studyLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("first Name: " + getFirstName() + ", Family Name: " + getFamilyName() + ", Study Level: " + studyLevel);
    }

    public String getStudyLevel() {
        return studyLevel;
    }
}