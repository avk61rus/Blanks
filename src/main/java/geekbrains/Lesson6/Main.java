package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;
import java.lang.String;
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
        int lengthSwim = 0; //инициализация (не установка) длины заплыва;
        int age =0;

        Animal[] zoo = {
                new Giraffe ("Жирик", "рыже-пятнистый", "гладкошерстный,", age, length, lengthSwim),
                new Fox ("Лиса-патрикеевна", "рыжая", "пушистая", age, length, lengthSwim )
        };

// task #1
/*--------------------------------------------------------------------------------*/
        System.out.println("\n// task #1");

        for (Animal animal : zoo) {
             animal.sound();
             animal.run();
             animal.swim();
        }

// task #2
/*---------------------------------------------------------------------------------*/
        System.out.println("\n// task #2 ");

        animalRun(500, zoo);   //Введите длину пробежки животных;
        animalSwim(10, zoo);  //Введите длину заплыва животных;
    }

// task #3
/*---------------------------------------------------------------------------------*/
    private static void animalRun(int lengthRun, Animal[] zoo) {
        for (Animal animal : zoo) {
            if ( animal instanceof Fox ) {
                if (lengthRun > 500) ((Fox) animal).run1(lengthRun);
                else ((Fox) animal).run(lengthRun);
            } else if (lengthRun > 200) ((Giraffe) animal).run1(lengthRun);
                        else ((Giraffe) animal).run(lengthRun);
                        int a;
        } System.out.println("\n// task #3 ");
    }

    private static void animalSwim(int lengthSwim, Animal[] zoo) {

        for (Animal animal : zoo) {
            if ( animal instanceof Fox ) {
                if (lengthSwim > 10) ((Fox) animal).swim1(lengthSwim);
                else ((Fox) animal).swim(lengthSwim);
            } else if (lengthSwim >= 0) ((Giraffe) animal).swim(lengthSwim);

        } return;
    }
}







