package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

public class Giraffe extends Animal {

    public Giraffe(String name, String color, String skills, int age, int lengthRun, int lengthSwim) {
        super(name, color, skills, age, lengthRun, lengthSwim) ;
    }
    @Override
    public void swim() {System.out.printf("Животное: %s %s %s не умеет плавать.\n", skills, color, name);}

    public void run(int lengthRun) {
        System.out.printf("Животное: %s %s %s пробежал %d метров.\n", skills, color, name, lengthRun);
    }

    public void run1(int lenghtRun) {
        System.out.printf("Животное: %s %s %s не может пробежать %d метров.\n", skills, color, name, lenghtRun);
    }

    public void swim(int lengthSwim) {
        System.out.printf("Животное: %s %s %s плавать не умеет! Он пешком по дну перейдет эту лужу шириной %d " +
                "метров.\n", skills, color, name, lengthSwim);}
}





////    @Override
//    public void swim(int lengthSwim)  {
//        System.out.printf("Животное: %s %s %s плавать не умеет! Он пешком по дну перейдет эту лужу.\n", skills, color, name);
//    }


