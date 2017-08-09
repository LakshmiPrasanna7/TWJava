import java.util.Scanner;

public class CenteredTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            printSpace(number-i);
            printStar(2*i-1);
            printSpace(number-i);
            System.out.println();
        }
    }
    private static void printStar(int num) {
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
    }

    private static void printSpace(int num) {
        for(int i=1;i<=num;i++){
            System.out.print(" ");
        }
    }
}
