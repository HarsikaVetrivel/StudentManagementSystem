package com.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("Welcome to the Student Management System!"); 
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Calculate Average CGPA");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                   deleteStudent();
                   break;

                case 5:
                   calculateAverageCgpa();
                   break;

                case 6:
                   System.out.println("Exiting application...");
                   break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        scanner.close();
    }

    private static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        Student student = new Student(id, name, department, cgpa);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudent() {

        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private static void deleteStudent() {

        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
    private static void calculateAverageCgpa() {

    if (students.isEmpty()) {
        System.out.println("No students available.");
        return;
    }

    double total = 0;

    for (Student student : students) {
        total += student.getCgpa();
    }

    double average = total / students.size();

    System.out.println("Average CGPA: " + average);
}
}
