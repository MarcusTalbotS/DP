package Code.untitled.src.Builder;

import Code.untitled.src.Engine.AbstractEngine;
import Code.untitled.src.Engine.DieselEngine;
import Code.untitled.src.Engine.ElectricalEngine;
import Code.untitled.src.Engine.EngineType;
import Code.untitled.src.Engine.NuclearEngine;

public abstract class AbstractBuilder implements Builder {

    protected int seats;
    protected boolean manual;
    protected AbstractEngine engine;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setManual(boolean manual) {
        this.manual = manual;
    }

    @Override
    public void setEngine(EngineType engine) {
        switch (engine) {
            case DIESEL -> this.engine = new DieselEngine();
            case ELECTRICAL -> this.engine = new ElectricalEngine();
            case NUCLEAR -> this.engine = new NuclearEngine();
        }
    }
}

