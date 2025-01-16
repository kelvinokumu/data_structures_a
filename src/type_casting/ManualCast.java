package type_casting;

public class ManualCast {
    public static void main(String[] args) {
        double myDouble = 10.99;
        int myInt = (int) myDouble; // (double to int)

        System.out.println("Double value: " + myDouble); // Output: 10.99
        System.out.println("Integer value: " + myInt); // Output: 10
    }
}

