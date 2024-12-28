import java.util.ArrayList;

class Student extends Person{
    private int StudentID;
    private static int id;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super( name, surname, age, gender);
        this.StudentID=StudentID;
        this.StudentID=id++;
    }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public double calculateGPA() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double)  sum/grades.size();
    }




    @Override
    public String toString() {
        return super.toString() + " My GPA is " + ".";
    }
}