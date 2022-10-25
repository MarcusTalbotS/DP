package Code.untitled.src.Engine;

public class DieselEngine extends AbstractEngine{

    public DieselEngine() {
        super(50);
    }

    @Override
    public String toString() {
        return "*oil leaks*";
    }

    @Override
    public void print(){
        System.out.println("Diesel startup noise.......");
    }
}
