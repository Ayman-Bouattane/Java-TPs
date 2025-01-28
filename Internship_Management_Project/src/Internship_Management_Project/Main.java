package Internship_Management_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InternManagement internManagement = new InternManagement();
        InternshipManagement internshipManagement = new InternshipManagement();
        int choice;

        while (true) {
            System.out.println("\n----------------------------------------------------------");
            System.out.println("1. Add an intern");
            System.out.println("2. Remove an intern");
            System.out.println("3. Display interns list");
            System.out.println("4. Add an internship");
            System.out.println("5. Associate an intern with an internship");
            System.out.println("6. Display all internships with associated interns");
            System.out.println("7. Search for an intern");
            System.out.println("8. Exit the application");
            System.out.println("----------------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Intern's First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Intern's Family Name: ");
                    String familyName = sc.nextLine();
                    System.out.print("Study Level: ");
                    String studyLevel = sc.nextLine();
                    internManagement.add(new Intern(firstName, familyName, studyLevel));
                    break;
                case 2:
                    System.out.print("First name of the intern to be removed: ");
                    String nameToRemove = sc.nextLine();
                    System.out.print("His Family Name: ");
                    String familyNameToRemove = sc.nextLine();
                    internManagement.remove(nameToRemove,familyNameToRemove);
                    break;
                case 3:
                    internManagement.display();
                    break;  
                case 4:
                    System.out.print("Internship Title: ");
                    String title = sc.nextLine();
                    System.out.print("Internship Duration (in weeks): ");
                    String duration = sc.nextLine();
                    internshipManagement.add(new Internship(title, duration));
                    break;
                case 5:
                    System.out.print("Name of the intern to associate: ");
                    String internfirstName = sc.nextLine();
                    System.out.print("Intern's family Name : ");
                    String internfamilyName = sc.nextLine();
                    System.out.print("Internship Title: ");
                    String internshipTitle = sc.nextLine();
                    Internship associatedinternship = null;
                    for (Internship internship : internshipManagement.getInternships()) {
                        if (internship.getTitle().equals(internshipTitle)) {
                            associatedinternship = internship;
                            break;
                        }
                    }
                    Intern associatedIntern = internManagement.search(internfirstName,internfamilyName);
                    if (associatedIntern != null && associatedinternship != null) {
                        associatedinternship.addIntern(associatedIntern);
                        System.out.println("Intern associated with the internship successfully.");
                    } else {
                        System.out.println("Intern or Internship not found.");
                    }
                    break;
                case 6:
                    internshipManagement.display();
                    break;
                case 7:
                    System.out.print("First name of the intern to search: ");
                    String searchName = sc.nextLine();
                    System.out.println("His family name : ");
                    String familyname = sc.nextLine();
                    Intern foundIntern = internManagement.search(searchName, familyname);
                    if (foundIntern != null) {
                        foundIntern.displayInfo();
                    } else {
                        System.out.println("Intern not found.");
                    }
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}