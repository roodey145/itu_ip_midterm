package methodAndFields;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters/Accessors
    public String getName() {
        // Return the name with the first letter of each word capitalized
        // i.e. pErSON NAME becomes Person Name
        String[] personName = name.split(" ");
        StringBuilder capName = new StringBuilder();

        for (int i = 0; i < personName.length; i++) {
            capName.append(String.valueOf(personName[i].charAt(0)).toUpperCase()
                    + personName[i].toLowerCase().substring(1));

            if (i < personName.length - 1) {
                // We want to separate the words with one space, but the last word should not
                // have a space following it
                capName.append(" ");
            }
        }

        return capName.toString();
    }

    public int getAge() {
        return age;
    }

    // Setters/Mutators
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other methods
    public void display() {
        System.out.println("Human");
        System.out.println(" -> Name: " + getName());
        System.out.println(" -> Age: " + getAge());
    }
}
