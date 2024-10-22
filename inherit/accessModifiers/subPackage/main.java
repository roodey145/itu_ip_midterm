package accessModifiers.subPackage;

import accessModifiers.superPackage.Animal;

public class main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty", 2);
        // Can not access getAge because it is protected method and SubHuman is in
        // another package than the Animal class
        System.out.println(cat.getAge());

        // The animalsCount is not accessible from here because the SubHuman class is
        // not in the same package as the Animal class
        System.out.println(Animal.animalsCount);
    }
}
