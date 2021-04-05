package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

public class Fox extends Animal {
    private int lengthSwim;
    private int length;
//    private String name;
//    private String color;
//    private String skills;
//    private int length;
//    private int lengthSwim;

    public Fox(String name, String color, String skills, int length, int lengthSwim) {
        super(name, color, skills, length, lengthSwim);
    }
    @Override
    public void sound() {
        System.out.printf("Животное: %s %s %s тявкает.\n", skills, color, name);
    }

   public void sound1(int length) {
       System.out.printf("Животное: %s %s %s не побежит на %d м!.\n", skills, color, name, length);
   }

    public void swim1(int lengthSwim) {
        System.out.printf("Животное: %s %s %s нe проплывет %d м!.\n", skills, color, name, lengthSwim);
    }
    @Override
    public void swim(int lengthSwim) {System.out.printf("Животное: %s %s %s проплывет %d м.\n", skills, color, name, lengthSwim);}

    public void run1(int length) {
        System.out.printf("Животное: %s %s %s не пробежит %d м!.\n", skills, color, name, length);
    }
}