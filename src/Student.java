import java.util.ArrayList;

class Student extends Person{
    private int StudentID;
    private static int id=1;
    private ArrayList<Integer> grades;

    public Student(){
        this.grades= new ArrayList<>();
        this.StudentID=id++;
    }

    public Student(String name, String surname, int age, String gender) {
        super( name, surname, age, gender);
        this.StudentID=StudentID;
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
        return super.toString() + "I am a student with ID" + StudentID + " my gpa is " + calculateGPA();
    }
}