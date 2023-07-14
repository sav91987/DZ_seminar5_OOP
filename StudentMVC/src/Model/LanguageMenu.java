package Model;

import java.util.Scanner;

public class LanguageMenu {
    /**
     * Метод для выбора языка меню
     * @return true для русского языка меню, false ждя английского
     */
    public static boolean chooseLanguage() {
    
        System.out.println("Выберите язык / Choose language:\n\t1. 'RU'\n\t2. 'EN'");
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
                System.out.println("Неверно указан пункт меню. Значение выбрано по умолчанию - 'RU'");
                flag = true;
        }
     
        return flag;
    
    }
}
