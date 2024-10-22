package implementVSextends;

public class main {
    public static void main(String[] args) {
        // The class B extends AbstractA and implements IB
        // The AbstractA extends class A and implements IA

        // B extends the abstract class AbstractA, therefore, you can instantiate an
        // object of class B and assign it to a variable of type AbstractA
        AbstractA classB1 = new B(); // Works

        // B implements the interface IB, therefore, you can instantiate an
        // object of class B and assign it to a variable of type IB
        IB classB2 = new B(); // Works

        // class B extends AbstractA which Implements interface IA.
        // Because the superclass has the functionality of interface IA, thus,
        // the subclass B also has inherited the functionality of IA
        IA classB3 = new B(); // Works

        // You can NOT instantiate an abstract class
        AbstractA abstractA = new AbstractA(); // This does NOT work!!

        // You can NOT instantiate an interface
        IB interfaceB = new IB(); // This does NOT work!!

        // The class C is a subclass of A, thus, we can instantiate an object of type C
        // and assign it to a variable of type A
        A classC1 = new C(); // Works

        // A does not extends the class C
        C classA1 = new A(); // This Does NOT work!!

    }
}
