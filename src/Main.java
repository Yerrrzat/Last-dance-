import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        File studentFile = new File("C:\\Users\\Админ\\IdeaProjects\\Frrrrrrrrr\\src\\students.txt");
        Scanner studentScanner = new Scanner(studentFile);

        while (studentScanner.hasNextLine()) {
            Student student = new Student();
            studentScanner.next();
            student.setName(studentScanner.next());
            student.setSurname(studentScanner.next());
            student.setAge(Integer.parseInt(studentScanner.next()));
            student.setGender(Boolean.parseBoolean(studentScanner.next()));

            while (studentScanner.hasNextInt()) {
                student.addGrade(studentScanner.nextInt());
            }
            school.addMember(student);
        }


        File teacherFile = new File("C:\\Users\\Админ\\IdeaProjects\\Frrrrrrrrr\\src\\teachers.txt");
        Scanner teacherScanner = new Scanner(teacherFile);

        while (teacherScanner.hasNextLine()) {
            Teacher teacher = new Teacher();
            teacherScanner.next();
            teacher.setName(teacherScanner.next());
            teacher.setSurname(teacherScanner.next());
            teacher.setAge(Integer.parseInt(teacherScanner.next()));
            teacher.setGender(Boolean.parseBoolean(teacherScanner.next()));
            teacher.setSubject(teacherScanner.next());
            teacher.setYearsOfExperience(Integer.parseInt(teacherScanner.next()));
            teacher.setSalary(Integer.parseInt(teacherScanner.next()));

            if (teacher.getYearsOfExperience() > 10) {
                teacher.giveRaise(10);
            }
            school.addMember(teacher);
        }
        school.printMembers();

    }
}
