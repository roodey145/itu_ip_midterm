package accessModifiers.superPackage;

import accessModifiers.subPackage.Cat;

public class main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty", 2);
        // The Method getAge can be accessed because superhuman is in the same package
        // as Animal class
        System.out.println(cat.getAge());

        // AnimalCount is accessible here because superhuman is in the same package as
        // the Animal class
        System.out.println(Animal.animalsCount);
    }
}
