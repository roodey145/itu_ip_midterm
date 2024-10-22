package methodAndFields;

public class main {
    public static void main(String[] args) {
        Human abdul = new Student("Abdulrahman OMAR mOHsen", 99);

        // TODO: Opppss... The age is negative?!!! fix it by modifing the function
        Human notAbdul = new Student("not abdul", -2);

        abdul.display();
        notAbdul.display();
    }
}
