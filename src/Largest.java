public class Largest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 25, num3 = 5;

        int largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}


