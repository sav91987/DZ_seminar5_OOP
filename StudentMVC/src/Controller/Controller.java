package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Model.Student;

public class Controller {

    private iGetModel<List<Student>> modelL;
    private iGetModel<HashMap<Long, Student>> modelHM;
    private iGetView view;
    private List<Student> students = new ArrayList<>();
    private HashMap<Long, Student> studentsHM = new HashMap<>();

    /**
     * @param modelL  - модель для получение List студентов
     * @param modelHM - модель для получение HashMap студентов
     * @param view    - View
     */
    public Controller(iGetModel<List<Student>> modelL, iGetModel<HashMap<Long, Student>> modelHM, iGetView view) {
        this.modelL = modelL;
        this.modelHM = modelHM;
        this.view = view;
    }

    // private boolean testData(List<Student> students)
    // {
    // if(students.size()>0)
    // {
    // return true;
    // }
    // else
    // {
    // return false;
    // }
    // }

    // public void update()
    // {
    // //MVP
    // students = model.getAllStudents();
    // if(testData(students))
    // {
    // view.printAllStudents(students);
    // }
    // else
    // {
    // System.out.println("Список студентов пуст!");
    // }

    // //MVC
    // //view.printAllStudents(model.getAllStudents());
    // }

    /**
     * Метод запуска меню программы и выполнения функций
     * 
     * @param flag если true, то работаем с List, иначе с HashMap
     */
    public void run(boolean flag) {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {

            students = modelL.getAllStudents();

            studentsHM = modelHM.getAllStudents();

            String command = view.prompt();

            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    view.printGoodBye();
                    break;
                case LIST:
                    if (flag) {
                        view.printAllStudents(students);
                    } else {
                        view.printAllStudentsHM(studentsHM);
                    }
                    break;
                case DELETE:
                    if (flag) {
                        students = view.deleteStudent(students);
                    } else {
                        studentsHM = view.deleteStudentHM(studentsHM);
                    }

                default:
                    break;
            }
        }
    }
}
