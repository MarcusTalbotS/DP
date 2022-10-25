package Code.untitled.src.Car;

import Code.untitled.src.Engine.AbstractEngine;

public abstract class AbstractCar implements Car {
    protected int seats;
    protected int price;
    protected AbstractEngine engine;
    protected boolean manual;

    protected AbstractCar(AbstractEngine engine, int seats, boolean manual, int price) {
        this.seats = seats;
        this.engine = engine;
        this.manual = manual;
        this.price = price;
    }

    @Override
    public int getPrice() {
        if(engine == null){
            System.out.println("Oh no, no engine found ☺, good luck driving tho");
            return this.price;
        }
        else {
            return this.price + engine.getPrice();
        }
    }

    public void print() {
        System.out.println("amount of seats: "+ seats);
        System.out.println("engine: "+ engine);
        if (manual) {
            System.out.println("Transmission is manual");
        } else {
            System.out.println("Transmission is automatic");
        }
    }
}

