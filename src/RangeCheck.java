public class RangeCheck {
    public static void main(String[] args) {
        int x = 15; // Assign 15 to x

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }

        // Change x to 5
        x = 5;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
    }
}

