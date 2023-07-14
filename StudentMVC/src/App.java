import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ChooseStorage;
import Model.LanguageMenu;
import Model.ModelHash;
//import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        HashMap<Long, Student> studentsHM = new HashMap<Long, Student>();
        studentsHM.put(1L, s1);
        studentsHM.put(2L, s2);
        studentsHM.put(3L, s3);
        studentsHM.put(4L, s4);
        studentsHM.put(5L, s5);
        studentsHM.put(6L, s6);

        // ModelFile fModel = new ModelFile("StudentDB.txt");
        // fModel.saveAllStudentToFile(students);

        // iGetModel modelFile = fModel;
        boolean flagCS = ChooseStorage.chooseStorage();

        iGetModel<List<Student>> modelL = new ModelList(students);
        iGetModel<HashMap<Long, Student>> modelHM = new ModelHash(studentsHM);

        boolean flag = LanguageMenu.chooseLanguage();

        iGetView view;

        if (flag) {
            view = new View();
        } else {
            view = new ViewEng();
        }

        Controller control;

        control = new Controller(modelL, modelHM, view);

        // control.update();

        control.run(flagCS);

    }
}
