import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
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

        teacherScanner.close();


        school.printMembers();

        for (Person member : school.getMembers()) {
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println("GPA of " + student + " is: " + student.calculateGPA());
            } else if (member instanceof Teacher) {
                Teacher teacher = (Teacher) member;
                System.out.println(teacher + " has a salary of: " + teacher.getSalary());
            }
        }

    }
}
