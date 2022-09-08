public class App {
    public static void main(String[] args) {

        Student me = new Student();
        me.surname = "Cruz";
        me.firstName = "Miko Clark";
        me.middleInitial = 'C';
        me.dateOfBirth = "03/19/2004";
        me.studentNumber = 2022100215;
        me.studentEmailAddress = "cruzm@students.national-u.edu.ph";
        me.iAmAwesome = true;
        me.sayMyStudentNumber();
        me.sayMyEmailAddress();
        me.amIAwesome();

    }
}
