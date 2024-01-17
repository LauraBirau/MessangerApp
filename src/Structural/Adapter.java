package src.Structural;

public class Adapter implements Target {
    @Override
    public void request() {
        System.out.println("Adapter handling the request");
    }
}
