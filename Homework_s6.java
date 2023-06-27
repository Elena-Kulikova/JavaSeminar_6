public class Homework_s6 {

    /**
     * Добавить в кота следующее. Пусть голод кота оценивается не true\false, а по шкале (1, 2, ..., 10).
     * Кот хочет съесть то количество еды, каков его текущий голод. Например, если аппетит кота = 100, а голод 5, то он съест 50.
     * Кот съедает все, что есть в тарелке. Например, в тарелке 50, коту нужно 70, он съест 50.
     * <p>
     * Пример.
     * Кот, его аппетит = 100
     * Пусть кот сыт наполовину, то есть его голод = 5. То есть, ему нужно 50 единиц еды.
     * Пусть в тарелке 25 единиц еды.
     * После обеда, сытость кота будет равна 7, а еда в тарелке закончится.
     */

    public static void main(String[] args) {
        Cats tom = new Cats("Tom", 200, 0);
        Plate plate = new Plate(50);
        
        System.out.println(tom);
        System.out.println(plate);
        tom.eat(plate);
        System.out.println();

        System.out.println(tom);
        plate.increaseFood(45);
        System.out.println(plate);
        tom.eat(plate);
        System.out.println();

        System.out.println(tom);
        plate.increaseFood(79);
        System.out.println(plate);
        tom.eat(plate);
        System.out.println();

        System.out.println(tom);
        plate.increaseFood(55);
        System.out.println(plate);
        tom.eat(plate);
        System.out.println();

        System.out.println(tom);
        plate.increaseFood(111);
        System.out.println(plate);
        tom.eat(plate);
        System.out.println();

        System.out.println(tom);
        System.out.println(plate);
        System.out.println("*****************************");

        Cats lucky = new Cats("Lucky", 100, 0);
                
        System.out.println(lucky);
        plate.increaseFood(20);
        System.out.println(plate);
        lucky.eat(plate);
        System.out.println();

        System.out.println(lucky);
        plate.increaseFood(10);
        lucky.eat(plate);
        System.out.println(plate);
        System.out.println();

        System.out.println(lucky);
        lucky.eat(plate);
        System.out.println(plate);
        System.out.println();

        System.out.println(lucky);
        System.out.println(plate);
        System.out.println("*****************************");


        Cats leopold = new Cats("Leopold", 50, 4);
        
        System.out.println(leopold);
        plate.increaseFood(20);
        System.out.println(plate);
        leopold.eat(plate);
        System.out.println();

        System.out.println(leopold);
        leopold.eat(plate);
        System.out.println(plate);
        System.out.println();

        System.out.println(leopold);
        System.out.println(plate);
    }

}