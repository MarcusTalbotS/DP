package Code.untitled.src.Builder;

import Code.untitled.src.Car.TeslaCar;
import Code.untitled.src.Engine.EngineType;

public class BuilderTesla extends AbstractBuilder {

    @Override
    public void setEngine(EngineType engine) {
        if (engine == EngineType.DIESEL) {
            throw new IllegalArgumentException("Tesla is not allowed to have a diesel-engine.");
        }
        super.setEngine(engine);
    }

    public TeslaCar build(){
        return new TeslaCar(this.engine, this.seats, this.manual);
    }
}
