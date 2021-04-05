package geekbrains.Lesson6.Animals;

public class Animal {
    protected String name;
    protected String color;
    protected String skills;
    protected int age;
    protected int length;
    protected int lengthSwim;

    public Animal(String name, String color, String skills, int age, int length, int lengthSwim) {
       this.name = name;
        this.color = color;
        this.skills = skills;
        this.age = age;
        this.length = length;
        this.lengthSwim = lengthSwim;
    }

    public Animal() {

    }

    public void sound() {System.out.printf("Животное: %s %s %s мычит.\n", skills, color, name);}

    public void run() {System.out.printf("Животное: %s %s %s бежит.\n", skills, color, name);}

    public void swim() {System.out.printf("Животное: %s %s %s плывет.\n", skills, color, name/*, lengthSwim*/);}
}

