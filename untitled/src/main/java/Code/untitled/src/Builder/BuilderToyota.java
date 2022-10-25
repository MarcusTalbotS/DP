package Code.untitled.src.Builder;

import Code.untitled.src.Car.ToyotaCar;

public class BuilderToyota extends AbstractBuilder {

    @Override
    public ToyotaCar build(){
        return new ToyotaCar(this.engine, this.seats, this.manual);
    }
}
