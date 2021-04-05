package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

/**
 * Project HomeWork_core1
 *
 * @Author Andrei Kirichko
 * Created 26.03.2021
 * v1.0
 */

public class Main {
    public static void main(String[] args) {

        int length = 0;     //инициализация (не установка) длины пробежки;
        int lengthSwim = 10; //инициализация (не установка) длины заплыва;

        Animal[] zoo = {
                new Giraffe ("Жирик", "рыже-пятнистый", "гладкошерстный,", length, lengthSwim),
                new Fox ("Лиса-патрикеевна", "рыжая", "пушистая,", length, lengthSwim )
        };

// task #1
/*--------------------------------------------------------------------------------*/
        System.out.println("\n// task #1");

        for (Animal animal : zoo) {
             animal.sound();
             animal.run();
             animal.swim(lengthSwim);
        }

// task #2 and #3
/*---------------------------------------------------------------------------------*/
        System.out.println("\n// task #2 ");
        length = 201;   // Установка длины пробежки (для жирафа 200м, для лисы 500м;
        lengthSwim = 18;  //Установка длина заплыва (жираф не плавает, лиса проплывет 10м;

        animalRun(length, zoo);
        animalSwim(lengthSwim, zoo);
    }

    private static void animalRun(int length, Animal[] zoo) {
        for (Animal animal : zoo) {
            if ( animal instanceof Fox ) {
                if (length > 500) ((Fox) animal).run1(length);
                else animal.run(length);
            } else if (length > 200) ((Giraffe) animal).run1();
                        else animal.run(length);
        } System.out.println("\n// task #3 ");
    }

    private static void animalSwim(int lengthSwim, Animal[] zoo) {

        for (Animal animal : zoo) {
            if ( animal instanceof Fox ) {
                if (lengthSwim > 10) ((Fox) animal).swim1(lengthSwim);
                else ((Fox) animal).swim(lengthSwim);
            } else if (lengthSwim >= 0) ((Giraffe) animal).swim(lengthSwim);
                  //else /*animal.run(lengthSwim);
        }
    }
}











