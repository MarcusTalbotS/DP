package Code.untitled.src.Decorator;

import Code.untitled.src.Car.AbstractCar;
import Code.untitled.src.Car.Car;

public abstract class AbstractDecorator implements Car {

    private Car base;
    private int price;

    protected AbstractDecorator(Car base, int price) {
        this.base = base;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return base != null ? base.getPrice() + this.price : this.price;
    }

    @Override
    public void print() {
        if (base != null) {
            base.print();
        }
    }
}
