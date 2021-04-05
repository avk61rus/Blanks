package geekbrains.Lesson7;

public class FeedingCat {

    public static void main(String[] args) {
        System.out.println();

        Bowl bowl = new Bowl(50);    // изначально положено в миску;
        bowl.addFood(0);              //добавить в миску еды;

        Cat[] zoo = {
                new Cat("Кошка", "Муся", 30, false),
                new Cat("Кот", "Марсик", 25, false),
                new Cat("Кошка", "Масяня", 20, false),
                new Cat("Кот", "Мурзик", 15, false)
        };

        for (Cat cat : zoo) {
            cat.eatCat(bowl);
        }
    }
}
