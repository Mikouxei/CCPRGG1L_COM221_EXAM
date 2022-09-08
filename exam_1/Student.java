public class Student {

// Properties
    String surname;
    String firstName;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

// Method
    public void sayMyStudentNumber() {
        System.out.println("My Student Number is: " + studentNumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("My Email Address is: " + studentEmailAddress);
    }
    public void amIAwesome() {
        if (iAmAwesome = true) {
            System.out.println("Am I Awesome?: Yes, I am!");
        }else{
            System.out.println("Am I Awesome?: Hmmm, No.");
        }
    }
}
