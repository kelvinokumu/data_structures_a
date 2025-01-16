package type_casting;

public class AutoCast {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt; // (int to double)

        System.out.println("Integer value: " + myInt); // Output: 10
        System.out.println("Double value: " + myDouble); // Output: 10.0
    }
}

