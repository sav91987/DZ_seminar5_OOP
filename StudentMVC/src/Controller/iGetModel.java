package Controller;

public interface iGetModel<T> {
    /**
     * Метод получения List или HashMap студентов
     * @return List или HashMap студентов
     */
    public T getAllStudents();    
}
