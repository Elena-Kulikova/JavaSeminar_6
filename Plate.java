public class Plate {

    private int food;

    public Plate() {
        this(100);
    }

    public Plate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("В тарелке должна быть еда");
        }

        this.food = food;
    }

    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public int decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            return -1;
        } else {
            int newFood = (food - this.food);
            this.food = 0;
            return newFood;
        }

    }

    @Override
    public String toString() {
        return "Количество еды в тарелке: (" + food + ")";
    }
}