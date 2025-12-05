import java.util.Scanner;

public class act {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String name = getStringInput(scanner, "Enter your name: ");
            int age = getIntInput(scanner, "Enter your Age: ");
            String address = getStringInput(scanner, "Enter your Address: ");
            double grade = getDoubleInput(scanner, "Enter your Grade: ");

            System.out.println("\nHello, " +
                    name + "\n\n" +
                    "Age: " + age + "\n" +
                    "Address: " + address + "\n" +
                    "Grade: " + grade);
            System.out.println("\n\nDear User, " + name + ". Please choose from the 5 display formats \n" +
                    "1. Display Full Name\n" +
                    "2. Display Full Name and Age\n" +
                    "3. Display Full Name and Address\n" +
                    "4. Display Full Name and Grade\n" +
                    "5. Display All Details ");

            int choice = getIntInput(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    format1(name);
                    break;

                case 2:
                    format2(name, age);
                    break;

                case 3:
                    format3(name, address);
                    break;

                case 4:
                    format4(name, grade);
                    break;

                case 5:
                    format5(name, age, address, grade);
                    break;

                default:
                    System.out.println("Invalid choices");
            }

          while (true) {
                System.out.println("\nRun again? (y/n)");
                String again = scanner.nextLine().trim(); 

                if (again.equalsIgnoreCase("y")) {
                    break; 
                } else if (again.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for using the program. Goodbye!");
                    scanner.close(); 
                    return; 
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n' only.");
                   
                }
            }

        }

    } // end

    // GET STRING INPUTS + VALIDATION FOR EMPTY
    public static String getStringInput(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            if (!input.trim().isEmpty()) {
                return input;
            }
            System.out.print("This section cannot be empty! \n");
        }
    }

    // GET INT VALUES + VALIDATES
    public static int getIntInput(Scanner scanner, String message) {

        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;

            } else {
                System.out.println("Invalid Input; Input in this section must be Numerical!");
                scanner.nextLine();
            }
        }
    }

    // GET DOUBLE VALUES + VALIDATES
    public static double getDoubleInput(Scanner scanner, String message) {

        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;

            } else {
                System.out.println("Invalid Input; Input in this section must be Numerical!");
                scanner.nextLine();
            }
        }
    }
    // 5Display formats

    // case 1; format 1
    public static void format1(String name) {
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("\nFormat 1: Display Full Name\n");
        System.out.println("Name: " + name);
    }

    // case 2; format 2
    public static void format2(String name, int age) {
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("\nFormat 2: Display Full Name and Address \n");
        System.out.println("Name: " + name +
                "\nAge: " + age);
    }

    // case 3; format 3
    public static void format3(String name, String address) {
        System.out.println("\nFormat 3: Display Full Name and Address \n");
        System.out.println("Name: " + name +
                "\nAddress: " + address);

    }

    // case 4; format 4
    public static void format4(String name, double grade) {
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("\nFormat 4: Display Full Nam and Grade \n");
        System.out.println("Name: " + name + "\nGrade: " + grade);
    }

    // case 5; format 5
    public static void format5(String name, int age, String address, double grade) {
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("Format 5: Display Full Name, Age, Address, and Grade \n");
        System.out.println("Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nGrade: " + grade);
    }

    // End na end gyud
}