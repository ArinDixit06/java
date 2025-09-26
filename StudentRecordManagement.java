import java.util.ArrayList;
import java.util.Scanner;


class Student {
    
    private int rollNo;
    private String name;
    private String course;
    private int marks;
    private char grade;

    
    
    public Student(int rollNo, String name, String course, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade(); 
    }

    private char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    
    public void displayRecord() {
        System.out.println("---------------------------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
        System.out.println("---------------------------------");
    }

    
    public int getRollNo() {
        return rollNo;
    }
}


public class StudentRecordManagement {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Student> studentList = new ArrayList<>();

        int choice;

        
        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Student Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // --- Add a new student ---
                    System.out.print("\nEnter Roll Number: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Marks (out of 100): ");
                    int marks = scanner.nextInt();

                    // Create a new Student object and add it to the list
                    Student newStudent = new Student(rollNo, name, course, marks);
                    studentList.add(newStudent);

                    System.out.println("\nStudent record added successfully!");
                    break;

                case 2:
                    
                    System.out.println("\n--- All Student Records ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No records found. Please add a student first.");
                    } else {
                        
                        for (Student student : studentList) {
                            student.displayRecord();
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("\nExiting the program. Thank you!");
                    break;

                default:
                    
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        } while (choice != 3);

        
        scanner.close();
    }
}