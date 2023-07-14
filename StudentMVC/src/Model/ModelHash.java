package Model;

import java.util.HashMap;

import Controller.iGetModel;

public class ModelHash implements iGetModel<HashMap<Long, Student>> {
    private HashMap<Long, Student> students;

    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }

    public HashMap<Long, Student> getAllStudents() {
        return students;
    }
}