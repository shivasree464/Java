import java.util.*;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("If you enter a number below 0 input will stop");
        System.out.println("Enter a number");
        while (true){
            Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();
            if(number<0){
                break;
            }
            if(number%2==0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }
}
