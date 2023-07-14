package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetView {
    void printAllStudents(List<Student> students);

    void printAllStudentsHM(HashMap<Long, Student> students);

    void printGoodBye();
    
    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    String prompt();

    // Метод удаления студента
    List<Student> deleteStudent(List<Student> students);

    HashMap<Long, Student> deleteStudentHM(HashMap<Long, Student> students);
    
}

