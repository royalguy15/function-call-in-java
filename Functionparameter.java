package function;

import java.util.*;

public class Functionparameter {

    public static void Calculatesum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a = sc.nextInt();
        System.out.print("Enter Number b: ");
        int b = sc.nextInt();
        Calculatesum(a, b);
    }

}
