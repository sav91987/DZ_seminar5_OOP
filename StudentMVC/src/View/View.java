package View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {

    public void printAllStudents(List<Student> students) {
        System.out.println("===================== список студентов ========================");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("===============================================================");
    }

    public void printAllStudentsHM(HashMap<Long, Student> students) {
        System.out.println("===================== список студентов ========================");
        for (Map.Entry<Long, Student> stud : students.entrySet()) {
            System.out.println(stud);
        }
        System.out.println("===============================================================");
    }

    @Override
    public String prompt() {
        System.out.println("Введите команду");
        Scanner in = new Scanner(System.in);
        return in.nextLine();

    }

    @Override
    public List<Student> deleteStudent(List<Student> students) {
        System.out.println("Введите ID студента:");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        int count = 0;
        int indexForDel = 0;
        int match = 0;
        for (Student stud: students){

            if (id == stud.getId()) {
                indexForDel = count;
                match++;
            }
            count++;
        }
       
        if (match!=0) {
            students.remove(indexForDel);
        }
        else {
            System.out.println("ID" + id + "не найден!");
        }
        return students;
    }

    @Override
    public HashMap<Long, Student> deleteStudentHM(HashMap<Long, Student> students) {
        System.out.println("Введите ID студента:");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        Long indexForDel = 0L;
        int match = 0;

        for (Map.Entry<Long, Student> stud : students.entrySet()) {
            if (id == stud.getValue().getId()) {
                indexForDel = stud.getKey();
                match++;
            }
        }

        if (match != 0) {
            students.remove(indexForDel);
        } else {
            System.out.println("ID " + id + " не найден!");
        }
        return students;
    }

    @Override
    public void printGoodBye() {
        System.out.println("Выход из программы");
    }

}
