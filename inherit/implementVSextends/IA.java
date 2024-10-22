package implementVSextends;

public interface IA extends IB, IC {
    int field1 = 0; // Implicitly public, static, and final

    //
    default public void display() {

    }
}