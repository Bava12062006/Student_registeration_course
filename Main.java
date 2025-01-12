import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> availableCourses = new ArrayList<>();
        ArrayList<String> registeredCourses = new ArrayList<>();

        // Predefined list of available courses
        availableCourses.add("Mathematics");
        availableCourses.add("Physics");
        availableCourses.add("Chemistry");
        availableCourses.add("Computer Science");
        availableCourses.add("Biology");

        System.out.println("Welcome to the Student Course Registration System!");

        boolean exit = false;
        while (!exit) {
            // Display the menu
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Unregister from a Course");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // View available courses
                    System.out.println("\nAvailable Courses:");
                    for (int i = 0; i < availableCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + availableCourses.get(i));
                    }
                    break;

                case 2:
                    // Register for a course
                    System.out.println("\nEnter the name of the course to register:");
                    String courseToRegister = scanner.nextLine();
                    if (availableCourses.contains(courseToRegister)) {
                        if (!registeredCourses.contains(courseToRegister)) {
                            registeredCourses.add(courseToRegister);
                            System.out.println("You have successfully registered for " + courseToRegister);
                        } else {
                            System.out.println("You are already registered for this course.");
                        }
                    } else {
                        System.out.println("The course is not available. Please check the available courses list.");
                    }
                    break;

                case 3:
                    // View registered courses
                    System.out.println("\nYour Registered Courses:");
                    if (registeredCourses.isEmpty()) {
                        System.out.println("You have not registered for any courses yet.");
                    } else {
                        for (String course : registeredCourses) {
                            System.out.println("- " + course);
                        }
                    }
                    break;

                case 4:
                    // Unregister from a course
                    System.out.println("\nEnter the name of the course to unregister:");
                    String courseToUnregister = scanner.nextLine();
                    if (registeredCourses.contains(courseToUnregister)) {
                        registeredCourses.remove(courseToUnregister);
                        System.out.println("You have successfully unregistered from " + courseToUnregister);
                    } else {
                        System.out.println("You are not registered for this course.");
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Thank you for using the Course Registration System. Goodbye!");
                    exit = true;
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        scanner.close();
    }
}
