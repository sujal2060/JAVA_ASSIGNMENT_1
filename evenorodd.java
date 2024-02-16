package evenOrOdd;
import java.util.*;
public class evenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter any number you want to check");
        number = scanner.nextInt();
        if(number % 2 ==0){
            System.out.println(number + " is an even number");
        }
        else{
            System.out.println(number + " is an odd number");
        }
    }
}
