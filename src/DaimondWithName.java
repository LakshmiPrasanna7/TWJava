import java.util.Scanner;

public class DaimondWithName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=scanner.nextInt();
        for(int i=1;i<number;i++){
            printSpace(number-i);
            printStar(2*i-1);
            printSpace(number-i);
            System.out.println();
        }
        System.out.println("Prasanna");
        for(int i=number-1;i>=1;i--){
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
