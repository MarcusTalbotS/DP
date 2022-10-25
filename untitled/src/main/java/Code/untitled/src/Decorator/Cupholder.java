package Code.untitled.src.Decorator;

import Code.untitled.src.Car.AbstractCar;
import Code.untitled.src.Car.Car;

public class Cupholder extends AbstractDecorator {

    public Cupholder(Car base) {
        super(base, 300);
    }

    public int getPrice(){
        return super.getPrice();
    }
    public void print(){
        super.print();
        System.out.println("With a cupholder...");
    }
}