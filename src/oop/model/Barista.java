package oop.model;

public class Barista {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachine("Deloghi");
        coffeeMachine.switchOn();
        coffeeMachine.makeCupOfCoffee();

    }
}
