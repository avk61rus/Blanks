package geekbrains.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Project HomeWork_core1
 *
 * @Author Andrei Kirichko
 * Created 26.03.2021
 * v1.0
 */


class VarArgs2 {
//    public static void vaTest(String msg, int... v) {
//        System.out.println(msg + v.length + "Содержимое: ");
//        for (int x : v) System.out.println((x + " "));
//        System.out.println();
//    }

    public static void main(String[] args) {
//        vaTest("один параметр: ", 10);
//        vaTest("три параметра: ", 1, 2, 3);
//        vaTest("без параметров: ");

        Workman[] workmen = {
                new Workman(2459, "Петров П.П.", "муж.", "Генеральный директор", 50, "+7 915 807 1461", "petrov@gmail.com"),
                new Workman(2460, "Сидоров С.С.", "муж.", "Главный инженер", 35, "+7 915 495 1825", "sidorov@gmail.com"),
                new Workman(2461, "Зайцева З.А.", "жен.", "Архитектор", 37, "+7 915 895 1890", "szaiyceva@gmail.com"),
                new Workman(2462, "Иванов А.А.", "муж.", "Руководитель проекта", 40, "+7 915 065 1434", "ivanov@gmail.com"),
                new Workman(2463, "Волкова М.И.", "жен.", "Руководитель проекта", 45, "+7 915 345 1565", "volkova@gmail.com"),
        };

        System.out.println("\nВывод по возрасту:");
        for (Workman workman : workmen) {
            if (workman.getAge() > 40) workman.workmanPrint();
        }

        System.out.println("Вывод по полу:");
        for (Workman workman : workmen) {
            if (workman.getGender() == "жен.") workman.workmanPrint();
        }

        System.out.println("Вывод по возрасту и по полу:");
        for (Workman workman : workmen) {
            if (workman.getGender() == "жен." && workman.getAge() > 40) workman.workmanPrint();
        }
    }
}
