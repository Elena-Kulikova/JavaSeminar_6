import java.util.Objects;

public class Cats {
    private String name; //  имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // степень сытости котаgit

    public Cats(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        int newFood = plate.decreaseFood(appetite / 10 * (10 - satiety));
        if (newFood == -1) {
            satiety = 10;
        } else {
            satiety = ((appetite - newFood) * 10) / appetite;
        }
    }

    @Override
    public String toString() {
        return name + ":" + "величина аппетита:"  + appetite + "," + "сытость:" + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cats anotherCat) {

            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    

}