package geekbrains.Lesson6.Animals;

public class Animal {
    protected String name;
    protected String color;
    protected String skills;
    protected int length;
    protected int lengthSwim;

    public Animal(String name, String color, String skills, int length, int lengthSwim) {
//        super(name, color, skills, length, lengthSwim);
       this.name = name;
        this.color = color;
        this.skills = skills;
        this.length = length;
        this.lengthSwim = lengthSwim;
    }

    public void sound() {System.out.printf("Животное: %s %s %s мычит.\n", skills, color, name);}

    public void swim(int lengthSwim) {
        System.out.printf("Животное: %s %s %s плывет.\n", skills, color, name, lengthSwim);}

    public void run(int length) {System.out.printf("Животное %s %s %s ,бежит %d м.\n", skills, color, name, length );}

    public void run() {System.out.printf("Животное %s %s %s ,бежит.\n", skills, color, name);}
}

