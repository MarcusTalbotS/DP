package Code.untitled.src.Builder;

import Code.untitled.src.Car.LadaCar;

public class BuilderLada extends AbstractBuilder {

    @Override
    public LadaCar build(){
        return new LadaCar(this.engine, this.seats, this.manual);
    }
}
