package Model;

import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel<List<Student>> {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }



    @Override
    public List<Student> getAllStudents() {
        return students;
    }

   
}
