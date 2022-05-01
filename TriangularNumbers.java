// It is said that the Pythagorians, a band of mathematicians in 
// ancient Greece who worked under Pythagoras (of Pythagorian theorem fame), 
// felt a mystical connection with the series of numbers 
// 1, 3, 6, 10, 15, 21, …


// first element = 1
// second element = first + 2nd index = 1 + 2 = 3
// third element = second + 3rd index = 3 + 3 = 6

import java.util.Scanner;

public class TriangularNumbers {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int n = in.nextInt();

        System.out.println("===== Calculating Triangular Series =====");
        triangle(n);
    }

    public static int triangle(int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        }
        int returnVal = (n + triangle(n-1));
        System.out.println(returnVal);
        return returnVal;
    }
}

