package Internship_Management_Project;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Application extends JFrame {
    private InternManagement internManagement;
    private InternshipManagement internshipManagement;
    private Map<Internship, Intern> internshipInternMap;

    public Application() {
        internManagement = new InternManagement();
        internshipManagement = new InternshipManagement();
        internshipInternMap = new HashMap<>();

        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addInternButton = new JButton("Add Intern");
        JButton removeInternButton = new JButton("Remove Intern");
        JButton displayInternsButton = new JButton("List All Interns");
        JButton addStageButton = new JButton("Add Internship");
        JButton associateInternButton = new JButton("Associate Intern & Internship");
        JButton displayInternsForStageButton = new JButton("Display Interns for Internship");
        JButton searchInternButton = new JButton("Search Intern");

        addInternButton.addActionListener(e -> addIntern());
        removeInternButton.addActionListener(e -> removeIntern());
        displayInternsButton.addActionListener(e -> displayInterns());
        addStageButton.addActionListener(e -> addInternship());
        associateInternButton.addActionListener(e -> associateIntern());
        displayInternsForStageButton.addActionListener(e -> displayInternsForInternship());
        searchInternButton.addActionListener(e -> searchIntern());

        JPanel panel = new JPanel();
        panel.add(addInternButton);
        panel.add(removeInternButton);
        panel.add(displayInternsButton);
        panel.add(addStageButton);
        panel.add(associateInternButton);
        panel.add(displayInternsForStageButton);
        panel.add(searchInternButton);
        add(panel);
    }

    private void addIntern() {
        String name = JOptionPane.showInputDialog(this, "Enter Intern's first name:");
        String familyName = JOptionPane.showInputDialog(this, "Enter his family Name:");
        String studyLevel = JOptionPane.showInputDialog(this, "Enter his Study Level:");
        internManagement.add(new Intern(name, familyName, studyLevel));
        JOptionPane.showMessageDialog(this, "Intern added successfully.");
    }

    private void removeIntern() {
        String firstname = JOptionPane.showInputDialog(this, "Enter Intern's first name to be Removed:");
        String familyName = JOptionPane.showInputDialog(this, "Enter his family Name:");
        internManagement.remove(firstname, familyName);
    }

    private void displayInterns() {
        StringBuilder displayText = new StringBuilder();
        for (Intern intern : internManagement.getInterns()) {
            displayText.append("first name: ").append(intern.getFirstName()).append(", family name: ").append(intern.getFamilyName()).append(", Study Level: ").append(intern.getStudyLevel()).append("\n");
        }
        JOptionPane.showMessageDialog(this, !displayText.isEmpty() ? displayText.toString() : "No interns available.");
    }

    private void addInternship() {
        String title = JOptionPane.showInputDialog(this, "Enter Internship Title:");
        String duration = JOptionPane.showInputDialog(this, "Enter Internship Duration:");
        internshipManagement.add(new Internship(title, duration));
        JOptionPane.showMessageDialog(this, "Internship added successfully.");
    }

    private void associateIntern() {
        String internFirstName = JOptionPane.showInputDialog(this, "Enter Intern's first name to Associate:");
        String internFamilyName = JOptionPane.showInputDialog(this, "Enter Intern's family Name:");
        String internshipTitle = JOptionPane.showInputDialog(this, "Enter Internship Title to Associate with:");
        Intern intern = internManagement.search(internFirstName, internFamilyName);
        Internship internship = internshipManagement.getInternships().stream().filter(s -> s.getTitle().equalsIgnoreCase(internshipTitle)).findFirst().orElse(null);
        if (intern != null && internship != null) {
            internshipInternMap.put(internship, intern);
            JOptionPane.showMessageDialog(this, "Intern associated with Internship successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Intern or Internship not found.");
        }
    }

    private void displayInternsForInternship() {
        String internshipTitle = JOptionPane.showInputDialog(this, "Enter Internship Title to Display Interns:");
        Internship internship = internshipManagement.getInternships().stream().filter(s -> s.getTitle().equalsIgnoreCase(internshipTitle)).findFirst().orElse(null);
        if (internship != null) {
            StringBuilder displayText = new StringBuilder();
            for (Map.Entry<Internship, Intern> entry : internshipInternMap.entrySet()) {
                if (entry.getKey().equals(internship)) {
                    Intern intern = entry.getValue();
                    displayText.append("Intern's First name: ").append(intern.getFirstName()).append(", Family Name: ").append(intern.getFamilyName()).append(", Study Level: ").append(intern.getStudyLevel()).append("\n");
                }
            }
            JOptionPane.showMessageDialog(this, displayText.length() > 0 ? displayText.toString() : "No interns associated with this Internship.");
        } else {
            JOptionPane.showMessageDialog(this, "Internship not found.");
        }
    }

    private void searchIntern() {
        String firstname = JOptionPane.showInputDialog(this, "Enter Intern's first name to be Searched:");
        String familyName = JOptionPane.showInputDialog(this, "Enter his family name:");
        Intern intern = internManagement.search(firstname, familyName);
        if (intern != null) {
            JOptionPane.showMessageDialog(this, "Intern found, first name: " + intern.getFirstName() + ", Family Name: " + intern.getFamilyName() + ", Study Level: " + intern.getStudyLevel());
        } else {
            JOptionPane.showMessageDialog(this,"Intern not found.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Application frame = new Application();
            frame.setVisible(true);
        });
    }
}