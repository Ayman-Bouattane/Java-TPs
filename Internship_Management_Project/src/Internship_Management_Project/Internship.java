package Internship_Management_Project;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String title;
    private String duration;
    private List<Intern> interns;

    public Internship(String title, String duration) {
        this.title = title;
        this.duration = duration;
        this.interns = new ArrayList<>();
    }

    public void addIntern(Intern intern) {
        interns.add(intern);
    }

    public void displayInfo() {
        System.out.println("Internship Title: " + title + ", Duration: " + duration + " weeks");
        System.out.println("Associated Interns:");
        for (Intern intern : interns) {
            intern.displayInfo();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public List<Intern> getInterns() {
        return interns;
    }
}