package Task2;

public class CoffeeMachine {
    private final int maxWaterLevel = 1300;
    private final int maxMilkLevel = 250;
    private final int maxCoffeLevel = 120;
    private static volatile int currentWaterLevel = 1300;
    private static volatile int currentMilkLevel = 250;
    private static volatile int currentCoffeLevel = 120;
private final Object lock = new Object();

public void setCurrentWaterMilkCoffee(int water, int milk , int coffee){
    synchronized (lock){
        currentCoffeLevel = coffee;
        currentMilkLevel = milk;
        currentWaterLevel = water;
    }

}

    public int getMaxWaterLevel() {
        return maxWaterLevel;
    }

    public int getMaxMilkLevel() {
        return maxMilkLevel;
    }

    public int getMaxCoffeLevel() {
        return maxCoffeLevel;
    }

    public int getCurrentWaterLevel() {
        return currentWaterLevel;
    }



    public int getCurrentMilkLevel() {
        return currentMilkLevel;
    }



    public int getCurrentCoffeLevel() {
        return currentCoffeLevel;
    }


}
