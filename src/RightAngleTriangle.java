import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String args[]) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
