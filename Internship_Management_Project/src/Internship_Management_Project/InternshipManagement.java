package Internship_Management_Project;

import java.util.ArrayList;
import java.util.List;

public class InternshipManagement implements Management<Internship> {
    private List<Internship> internships;

    public InternshipManagement() {
        internships = new ArrayList<>();
    }

    public void add(Internship internship) {
        internships.add(internship);
        System.out.println("Internship added successfully.");
    }

    public void remove(String title,String duration) {
        internships.removeIf(internship -> (internship.getTitle().equals(title) && internship.getDuration().equals(duration)));
        System.out.println("Internship removed if existed.");
    }

    public void display() {
        for (Internship internship : internships) {
            internship.displayInfo();
        }
    }

    public List<Internship> getInternships() {
        return internships;
    }
}