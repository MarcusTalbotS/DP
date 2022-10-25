package Code.untitled.src.Engine;

public class NuclearEngine extends AbstractEngine{

    public NuclearEngine() {
        super(1000);
    }

    @Override
    public String toString() {
        return "*radiates radiation*";
    }

    @Override
    public void print(){
        System.out.println("Geiger counter going mad noise.....");
    }
}
