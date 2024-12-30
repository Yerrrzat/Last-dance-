import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();
        File studentFile = new File("src/students.txt");
        Scanner studentScanner = new Scanner(studentFile);

        while (studentScanner.hasNextLine()) {
            Student student = new Student();
            student.setName(studentScanner.next());
            student.setSurname(studentScanner.next());
            student.setAge(Integer.parseInt(studentScanner.next()));
            String gender = studentScanner.next();
            if (gender.equals("Male")){
                student.setGender(true);
            }
            else if (gender.equals("Female")){
                student.setGender(false);
            }

            while (studentScanner.hasNextInt()) {
                student.addGrade(studentScanner.nextInt());
            }
            school.addMember(student);
        }
        studentScanner.close();

        File teacherFile = new File("src/teachers.txt");
        Scanner teacherScanner = new Scanner(teacherFile);

        while (teacherScanner.hasNextLine()) {
            Teacher teacher = new Teacher();
            teacher.setName(teacherScanner.next());
            teacher.setSurname(teacherScanner.next());
            teacher.setAge(Integer.parseInt(teacherScanner.next()));
            String gender = teacherScanner.next();
            if (gender.equals("Male")){
                teacher.setGender(true);
            }
            else if (gender.equals("Female")){
                teacher.setGender(false);
            }
            teacher.setSubject(teacherScanner.next());
            teacher.setYearsOfExperience(Integer.parseInt(teacherScanner.next()));
            teacher.setSalary(Integer.parseInt(teacherScanner.next()));

            if (teacher.getYearsOfExperience() > 10) {
                teacher.giveRaise(10);
            }
            school.addMember(teacher);
        }
        teacherScanner.close();

        school.printMembers();
    }
}