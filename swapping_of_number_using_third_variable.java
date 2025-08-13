import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first positive integer: ");
        int a = input.nextInt();
        System.out.print("enter second positive integer: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swap: a = " + a + ", b = " + b);

        input.close();
    }
}
