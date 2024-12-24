import java.util.ArrayList;

class Student extends Person{
    private int StudentID;
    private ArrayList<Integer> grades;

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public Student() {
        super();
    }

    public Student(String name, String surname, int age, boolean gender) {
        super( name, surname, age, gender);
        this.StudentID=StudentID;
    }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public void calculateGpa(){

    }




    @Override
    public String toString() {
        return super.toString() + " My GPA is " + ".";
    }
}