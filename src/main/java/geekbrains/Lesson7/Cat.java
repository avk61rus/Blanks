package geekbrains.Lesson7;

public class Cat {
    public String type;
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String type, String name, int appetite, boolean satiety) {
        this.type = type;
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eatCat(Bowl bowl) {
        if (bowl.getFoodAmount() < this.appetite) {
            System.out.printf("%s %s сьел бы %d грамм еды, но в тарелке только " + bowl.getFoodAmount() +
                            ". %s обиделся и есть не будет!\n", this.type, this.name, this.appetite,this.name );
        } else  {
            System.out.printf("%s %s cкушал %d грамм еды и наелся.\n",this.type, this.name, this.appetite);
            bowl.decrementFood(appetite);
            satiety = true;
        }
    }
}
