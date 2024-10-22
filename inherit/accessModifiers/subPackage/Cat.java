package accessModifiers.subPackage;

import accessModifiers.superPackage.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", 2);
        System.out.println(cat.getAge());
    }
}
