import java.util.Scanner;

public class swtv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first integer");
        int a = input.nextInt();
        System.out.print("enter second integer");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swap: a = " + a + ", b = " + b);

        input.close();
    }
}
