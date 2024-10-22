package accessModifiers.superPackage;

public class Animal {
    // Private: accessible only within the current class, i.e. Animal class
    private int age;
    private String name;

    // No access modifier: accessible within the package
    static int animalsCount = 0;

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
        animalsCount++;
    }

    //////////////////////
    // Getters/Accessor /
    ////////////////////

    // Protected: accessible to all classes inside the same package,
    // unaccessible to classes outside the package and do not inherit from the
    // Animal class
    protected int getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }
}
