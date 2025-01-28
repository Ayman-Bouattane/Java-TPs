package Internship_Management_Project;

import java.util.ArrayList;
import java.util.List;

public class InternManagement implements Management<Intern> {
    private List<Intern> interns;

    public InternManagement() {
        interns = new ArrayList<>();
    }
    public void add(Intern intern) {
        for (Intern i : interns) {
            if (i.getFirstName().equals(intern.getFirstName()) && i.getFamilyName().equals(intern.getFamilyName())) {
                System.out.println("The intern already exists.");
                return;
            }
        }
        interns.add(intern);
        System.out.println("Intern added successfully.");
    }

    public void remove(String firstName,String familyName) {
        interns.removeIf(intern -> intern.getFirstName().equals(firstName) && intern.getFamilyName().equals(familyName));
        System.out.println("Intern removed if existed.");
    }

    public void display() {
        for (Intern intern : interns) {
            intern.displayInfo();
        }
    }

    public Intern search(String firstName,String familyName) {
        for (Intern intern : interns) {
            if (intern.getFirstName().equals(firstName) && intern.getFamilyName().equals(familyName)) {
                return intern;
            }
        }
        return null;
    }
    public List<Intern> getInterns() {
        return interns;
    }
}
