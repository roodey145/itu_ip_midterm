package classes;

public class main {
    public static void main(String[] args) {
        Methods methodsEmptyConstructor = new Methods();
        methodsEmptyConstructor.display();

        Methods methodsTextConstructor = new Methods("Some text");
        methodsTextConstructor.display();

        methodsTextConstructor.setValue(10, 5.1f, 24);
        methodsTextConstructor.setValue('A');
        methodsTextConstructor.display();
    }
}
