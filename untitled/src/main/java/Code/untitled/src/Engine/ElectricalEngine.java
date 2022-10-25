package Code.untitled.src.Engine;

public class ElectricalEngine extends AbstractEngine{

    public ElectricalEngine() {
        super(100);
    }

    @Override
    public String toString() {
        return "*electricity sparks*";
    }

    @Override
    public void print(){
        System.out.println("Electric noise ... zoom...");
    }
}
