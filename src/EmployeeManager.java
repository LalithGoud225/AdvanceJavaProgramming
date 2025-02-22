import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        //Below we are providing the input for address and employee, that is going to call the address and employee class files.

        Address address = new Address("121 East Hunt Ave", "Warrensburg","Missouri","64093");
        Employee employee = new Employee("E001", "John Doe", "Software Engineer", 75000, address);

        //the below backupEmployee is for storing the backup
        Employee backupEmployee = employee.clone();
        System.out.println("Employee details");
        System.out.println(employee);
        //Using while(true) because this program ask for repetitive inputs until it choose to exit
        //without the loop this menu appears only once

        while(true) {
            //Below we will be displaying the detail option which can be performed in this loop
            System.out.println("Choose an option:\\n1. Edit Salary\\n2. Edit Address\\n3. Undo Changes\\n4. Exit");
            //below enter the int value as you wanted to perform the task
            int choice = scanner.nextInt();
            scanner.nextLine();
            //after you gave the input, below it will select the operator on your imput
            if (choice == 1) {
                System.out.print("Enter new salary: ");
                double newSalary = scanner.nextDouble();
                scanner.nextLine();
                backupEmployee = employee.clone(); // Backup before changing
                employee.setSalary(newSalary);
            } else if (choice == 2) {
                System.out.print("Enter new street: ");
                String street = scanner.nextLine();
                System.out.print("Enter new city: ");
                String city = scanner.nextLine();
                System.out.print("Enter new state: ");
                String state = scanner.nextLine();
                System.out.print("Enter new ZIP: ");
                String zip = scanner.nextLine();
                backupEmployee = employee.clone(); // Backup before changing
                employee.setAddress(new Address(street, city, state, zip));
            } else if (choice == 3) {
                System.out.println("Undoing changes...");// here its calling the backupy employee which we have stored intially
                employee = backupEmployee.clone();
            } else if (choice == 4) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.println("Updated Employee Record:");
            System.out.println(employee);
        }
        }
    }
