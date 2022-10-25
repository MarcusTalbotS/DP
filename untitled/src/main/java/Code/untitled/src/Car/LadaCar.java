package Code.untitled.src.Car;

import Code.untitled.src.Engine.AbstractEngine;

public class LadaCar extends AbstractCar {

    public LadaCar(AbstractEngine engine, int seats, boolean manual){
        super(engine, seats, manual, 90);
    }

    @Override
    public void print() {
        System.out.println("Lada");
        super.print();
    }
}
