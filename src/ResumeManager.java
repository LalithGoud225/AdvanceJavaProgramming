import java.util.*;

public class ResumeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resume> resumes = new ArrayList<>();
        ArrayList<Resume> duplicateResumes = new ArrayList<>();
        //as mentioned in the EmployeeManager.java class file here also I have used same while loop and if else
        while (true) {
            System.out.println("Choose an option:\n1. Add Resume\n2. Display Resumes\n3. Check Duplicates and Display Unique Applications\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter candidate name: ");
                String name = scanner.nextLine();
                System.out.print("Enter years of experience: ");
                int experience = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter skills (comma separated): ");
                String[] skillArray = scanner.nextLine().split(",");
                ArrayList<String> skills = new ArrayList<>(Arrays.asList(skillArray));
                System.out.print("Enter street: ");
                String street = scanner.nextLine();
                System.out.print("Enter city: ");
                String city = scanner.nextLine();
                System.out.print("Enter state: ");
                String state = scanner.nextLine();
                System.out.print("Enter ZIP: ");
                String zip = scanner.nextLine();
                Address address = new Address(street, city, state, zip);

                Resume newResume = new Resume(name, experience, skills, address);
                //created new array list that stores duplicate and that warns when you enter the same details
                //but it only warns but then gets added, because to show the function of duplicate records

                if (resumes.contains(newResume)) {
                    System.out.println("Warning: Duplicate application detected!");
                    duplicateResumes.add(newResume);
                }
                resumes.add(newResume);
                System.out.println("Resume added successfully!");
            } else if (choice == 2) {
                System.out.println("--- All Received Applications ---");// this diplays the all entered resumes
                for (Resume r : resumes) {
                    System.out.println(r);
                }
            } else if (choice == 3) {
                System.out.println("--- Duplicate Applications Found ---");// show case duplicate
                for (Resume r : duplicateResumes) {
                    System.out.println(r);
                }

                System.out.println("\n--- Final Unique Applications ---");
                HashSet<Resume> uniqueResumes = new HashSet<>(resumes);//here it gives final unique applications
                for (Resume r : uniqueResumes) {
                    System.out.println(r);
                }

                System.out.println("Total Unique Applications: " + uniqueResumes.size());//here it provides count of unique application
            } else if (choice == 4) {
                System.out.println("Exiting program.");
                break;
            }
        }
        scanner.close();
    }
}