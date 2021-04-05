package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Fox extends Animal {

    Fox(String name, String color, String skills, int age, int lengthRun, int lengthSwim) {
        super(name, color, skills, age, lengthRun, lengthSwim);
        }

    @Override
    public void sound() {
        System.out.printf("Животное: %s %s %s тявкает.\n", skills, color, name);
    }

    public void run(int lengthRun) {
        System.out.printf("Животное: %s %s %s пробежала %d метров.\n", skills, color, name, lengthRun);
    }

    public void run1(int lengthRun) {
        System.out.printf("Животное: %s %s %s не пробежит %d метр.\n", skills, color, name, lengthRun);
    }

        public void swim(int lengthSwim) {
        System.out.printf("Животное: %s %s %s проплыла %d метров.\n", skills, color, name, lengthSwim);
    }

    public void swim1(int lengthSwim) {
        System.out.printf("Животное: %s %s %s нe проплывет %d метров.\n", skills, color, name, lengthSwim);
    }
 /*----------------------------------------------------------------------------------------------------------------*/
//    public String toString()
//    {
//        return "Fox {" +
//                "name = '" + name + '\'' +
//                "color = '" + color + '\'' +
//                " age = " + age +'}';
//
//    }
}



