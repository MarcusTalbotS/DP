package Code.untitled.src.Builder;

import Code.untitled.src.Car.AbstractCar;
import Code.untitled.src.Engine.EngineType;

public interface Builder {
    void setSeats(int seats);
    void setManual(boolean manual);
    void setEngine(EngineType engine);
    AbstractCar build();
}
