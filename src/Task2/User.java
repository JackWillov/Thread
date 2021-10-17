package Task2;

public class User extends Thread {
    CoffeeMachine machine = new CoffeeMachine();
    public int choise;
    String name1;
      volatile boolean can;

    public User(CoffeeMachine coffeeMachine, int coffee, String userName) {
        machine = coffeeMachine;
        choise = coffee;
        name1 = userName;
        start();

    }
// choise 1 its amerricano 2 =cappucino 3= ecspresso
    @Override
    public synchronized void run() {

        if (choise == 1 &&
                machine.getCurrentCoffeLevel() - 20 >= 0 && machine.getCurrentMilkLevel() - 40 >= 0 && machine.getCurrentWaterLevel() - 100 >= 0) {

            machine.setCurrentWaterMilkCoffee(
                    machine.getCurrentWaterLevel() - 100,
                    machine.getCurrentMilkLevel() - 40,
                    machine.getCurrentCoffeLevel() - 20);
            can = true;


        } else if (choise == 2 &&
                machine.getCurrentCoffeLevel() - 40 >= 0 && machine.getCurrentMilkLevel() - 30 >= 0 && machine.getCurrentWaterLevel() - 150 >= 0) {

            machine.setCurrentWaterMilkCoffee(
                    machine.getCurrentWaterLevel() - 150,
                    machine.getCurrentMilkLevel() - 30,
                    machine.getCurrentCoffeLevel() - 40);
            can = true;

        } else if (choise == 3 &&
                machine.getCurrentCoffeLevel()-30>=0 &&machine.getCurrentMilkLevel()-10>=0&&machine.getCurrentWaterLevel()-70>=0) {
            machine.setCurrentWaterMilkCoffee(
                    machine.getCurrentWaterLevel()-70,
                    machine.getCurrentMilkLevel()-10,
                    machine.getCurrentCoffeLevel()-30);
            can = true;

        }
    }


    public String getName1() {
        return name1;
    }


}
