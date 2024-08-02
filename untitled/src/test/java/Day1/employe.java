package Day1;

import java.util.Scanner;

public class employe {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter Employee Name: ");
//        String empName = scanner.nextLine();
//        System.out.println("Name: " + empName);
//        System.out.print("Enter Employee Name is done : ");




        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee Email: ");
        String empEmail = scanner.nextLine();

        System.out.print("Enter Employee Phone Number: ");
        String empPhoneno = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine(); // consume the newline

        System.out.print("Enter Employee Gender: ");
        String empGender = scanner.nextLine();

        System.out.print("Enter Employee City: ");
        String empCity = scanner.nextLine();

        // Display the entered details
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + empEmail);
        System.out.println("Phone Number: " + empPhoneno);
        System.out.println("Salary: " + empSalary);
        System.out.println("Gender: " + empGender);
        System.out.println("City: " + empCity);

        scanner.close();

    }



}
