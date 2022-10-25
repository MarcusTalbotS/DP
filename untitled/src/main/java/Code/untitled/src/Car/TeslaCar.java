package Code.untitled.src.Car;
import Code.untitled.src.Engine.AbstractEngine;


public class TeslaCar extends AbstractCar {

    public TeslaCar(AbstractEngine engine, int seats, boolean manual){
        super(engine, seats, manual, 450);
    }

    @Override
    public void print() {
        System.out.println("Tesla");
        super.print();
    }
}
