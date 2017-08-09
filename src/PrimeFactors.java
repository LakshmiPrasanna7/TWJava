import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int number= scanner.nextInt();
        for(int i=2;i<=number;i++){
            if(number%i==0 && isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int number) {
        for(int i=2;i<=(int)Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
