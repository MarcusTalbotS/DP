package Code.untitled.src.Car;
import Code.untitled.src.Engine.AbstractEngine;

public class ToyotaCar extends AbstractCar {

    public ToyotaCar(AbstractEngine engine, int seats, boolean manual){
        super(engine, seats, manual, 200);
    }

    @Override
    public void print() {
        System.out.println("Toyota");
        super.print();
    }
}
