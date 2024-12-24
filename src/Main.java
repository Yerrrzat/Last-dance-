import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        School school = new School();

        File studentFile = new File("C:\\Users\\Админ\\IdeaProjects\\Intro\\src\\students.txt");
        Scanner studentScanner = new Scanner(studentFile);

        while (studentScanner.hasNextLine()) {
            Student student = new Student();
            String name = studentScanner.next();
            String surname = studentScanner.next();
            int age = Integer.parseInt(studentScanner.next());
            boolean gender = studentScanner.next().equalsIgnoreCase("Male");

            while (studentScanner.hasNextLine()) {
                student.setName(name);
                student.setSurname(surname);
                student.setAge(age);
                student.setGender(gender);
                students.add(student);
                school.addMember(student);
            }
        }


        File teacherFile = new File("C:\\Users\\Админ\\IdeaProjects\\Intro\\src\\teachers.txt");
        Scanner teacherScanner = new Scanner(teacherFile);

        while (teacherScanner.hasNextLine()) {
            Teacher teacher = new Teacher();
            teacher.setName(teacherScanner.next());
            teacher.setSurname(teacherScanner.next());
            teacher.setAge(Integer.parseInt(teacherScanner.next()));
            teacher.setGender(teacherScanner.next().equalsIgnoreCase("Male"));
            teacher.setSubject(teacherScanner.next());
            teacher.setYearsOfExperience(Integer.parseInt(teacherScanner.next()));
            teacher.setSalary(Integer.parseInt(teacherScanner.next()));

            teachers.add(teacher);
            school.addMember(teacher);
        }

        teacherScanner.close();


        school.printMembers();
    }
}
