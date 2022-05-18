import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you enter any number below 1 input will stop");
        System.out.println("Enter a Number");
        while (true) {

            int input = scanner.nextInt();
            if(input<1){
                System.out.println("Thank you");
                break;

            }
            int count = 0;
            for (int i = 1; i <= input; i++) {
                if (input % i == 0) {
                    count++;
                }

            }
            if (count <=2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}