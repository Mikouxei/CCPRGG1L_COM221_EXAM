import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        String oddEven = oddOrEven(lastTwoDigits);
        System.out.println(oddEven);
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("\n2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        String primeComposite = primeOrComposite(lastDigit);
        System.out.println(primeComposite);
        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("\n3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        int total1 = charCount1(firstName);
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int total2 = charCount2(surName);
        int sum = total1 + total2;
        System.out.println("The character length of your full name is " + sum + "." );

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("\n4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();
        int finalNumber = largestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(finalNumber + " is the largest number.");

        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("\n5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int lastDigits = lastSixNumbers(studentNumber);
        System.out.println("The last 6 digits of your student number is " + lastDigits);

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("\n6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();

        if (studentNumber == 2022100215) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("\n7. Case sensitivity check");

        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();

        if (firstName == firstName.toUpperCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();

        if (surName == surName.toLowerCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("\n8. Nested conditions");

        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        // If BSIT
        if (course.equals("BSIT")) {
            System.out.print("Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();

            if (specialization1.equals("MWAA")) {
                System.out.println("valid");
            }
            else if (specialization1.equals("MAA")) {
                System.out.println("valid");
            }
            else {
                System.out.println("invalid");
            }
        }
        // If BSCS
        else if (course.equals("BSCS")) {
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();

            if (specialization2.equals("DF")) {
                System.out.println("valid");
            }
            else if (specialization2.equals("ML")) {
                System.out.println("valid");
            }
            else {
                System.out.println("invalid");
            }

        } else {
            System.out.println("invalid");
        }

        

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("\n9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand) {
            case "STEM":
                System.out.println("valid");
                break;
            case "ICT":
                System.out.println("valid");
                break;
            case "HUMSS":
                System.out.println("valid");
                break;
            case "HOME ECONOMICS":
                System.out.println("valid");
                break;
            case "ARTS AND DESIGN":
                System.out.println("valid");
                break;
            case "TVL MARITIME":
                System.out.println("valid");
                break;
            default:
                System.out.println("invalid");
                break;

        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("\n10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("cruz") && (studentEmailAddress.contains("@students.national-u.edu.ph"))) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        System.out.println("\n11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        int number = formula(n);
        System.out.println(number);
        // Close scanner
        scan.close();
    }

    // 1. Odd or Even
    static String oddOrEven(int numbers) {
        if (numbers % 2 == 0) {
            return ("EVEN");
        } else {
            return ("ODD");
        }
    }

    // 2. Prime or Composite
    static String primeOrComposite(int number) {
        boolean isPrime = true;
        if (number == 1 || number < 1) {
        return ("NEITHER");
        } else {
            for (int i = 2; i <= (number/2); i++) {
                if ( (number % i) == 0);
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            return ("PRIME");
        else {
            return ("COMPOSITE");
        }
    }

    // 3. First Name and Last Name
   static int charCount1 (String firstName) {
    int stringLength1 = firstName.length();
    return (stringLength1);
   }
   static int charCount2 (String surName) {
    int stringLength2 = surName.length();
    return (stringLength2);
   }

   // 4. Largest Number
   static int largestNumber(int firstNumber, int secondNumber, int thirdNumber) {
    if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
        return (firstNumber);
    }
    else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
        return (secondNumber);
    }
    else {
        return (thirdNumber);
    }
}
    // 5. Last 6 digits
    static int lastSixNumbers (int studentNumber) {
    int numbers = studentNumber % 1000000;
    return (numbers);
    }

    // 11. Mystery Method
    static int formula (int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = (-n - (-n + i));
        }

        if (sum % 2 == 0) {
            return (-1 * sum);
        } else {
            return(sum);
        }
    }

}
