package Model;

import java.util.Scanner;

public class ChooseStorage {
    public static boolean chooseStorage() {
    
        System.out.println("Выберите вариант хранения списка студентов / Choose value storage list of students :\n\t1. 'List'\n\t2. 'HashMap'");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        boolean flag;

        switch (value) {
            case 1:
                flag = true;
                break;
        
            case 2:
                flag = false;;
                break;
            default:
                System.out.println("Неверно указан пункт меню. Значение выбрано по умолчанию - 'List'");
                flag = true;
        }
     
        return flag;
    
    }
}
