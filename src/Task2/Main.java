package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        List<User> listAll = new ArrayList<>();


        listAll.add(new User(coffeeMachine, 1, "Vasyl"));
        listAll.add(new User(coffeeMachine, 3, "Yulian"));
        listAll.add(new User(coffeeMachine, 2, "Volodia"));
        listAll.add(new User(coffeeMachine, 1, "Nazar"));
        listAll.add(new User(coffeeMachine, 3, "Dmytro"));
        listAll.add(new User(coffeeMachine, 3, "Pavlo"));
        listAll.add(new User(coffeeMachine, 1, "Hurman"));
        listAll.add(new User(coffeeMachine, 2, "Azbek"));
        listAll.add(new User(coffeeMachine, 1, "Maksym"));
        listAll.add(new User(coffeeMachine, 3, "Bohdan"));
        listAll.add(new User(coffeeMachine, 2, "Petro"));
        listAll.add(new User(coffeeMachine, 2, "Ktoś"));


        for (int i = 0; i < listAll.size(); i++) {
//            listAll.get(i).join();
        }


        System.out.println("User who take a coffee : ");
        List<User> listCan = listAll.stream()
                .filter((x) -> x.can == true)
                .collect(Collectors.toList());
        listCan.stream().forEach(user -> System.out.println(user.getName1()));
        System.out.println();
        System.out.println("User who cant take a coffee : ");
        List<User> listCant = listAll.stream()
                .filter((x) -> x.can != true)
                .collect(Collectors.toList());
        listCant.stream().forEach(user -> System.out.println(user.getName1()));

        System.out.println();
        System.out.println("Current ingredients level : ");
        System.out.println("Coffee = "+ coffeeMachine.getCurrentCoffeLevel());
        System.out.println("Milk = "+ coffeeMachine.getCurrentMilkLevel());
        System.out.println("Water = "+ coffeeMachine.getCurrentWaterLevel());
        System.out.println();
        System.out.println("Ingredients used : ");
        System.out.println("Coffee = "+(coffeeMachine.getMaxCoffeLevel() - coffeeMachine.getCurrentCoffeLevel()));
        System.out.println("Milk = "+(coffeeMachine.getMaxMilkLevel() - coffeeMachine.getCurrentMilkLevel()));
        System.out.println("Water = "+(coffeeMachine.getMaxWaterLevel() - coffeeMachine.getCurrentWaterLevel()));
    }


}
