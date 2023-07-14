package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetView {
    /**
     * Метод печатает List студентов
     * 
     * @param students List студентов
     */
    void printAllStudents(List<Student> students);

    /**
     * Метод печатает HashMap студентов
     * 
     * @param students HashMap студентов
     */
    void printAllStudentsHM(HashMap<Long, Student> students);

    /**
     * Печает прощальное сообщение после завершения работы программы
     */
    void printGoodBye();

    /**
     * Метод для запроса ввода пользователя, чтобы получить команду или данные от
     * него
     * 
     * @return команду EXIT, DELETE, LIST
     */
    String prompt();

    /**
     * Метод удаления студента из List
     * 
     * @param students List студентов
     * @return List после удаления элемента
     */
    List<Student> deleteStudent(List<Student> students);

    /**
     * Метод удаления студента из HashMap
     * 
     * @param students HashMap студентов
     * @return HashMap после удаления элемента
     */
    HashMap<Long, Student> deleteStudentHM(HashMap<Long, Student> students);

}
