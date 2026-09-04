import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        long result;
        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -(n + 1) / 2;
        }
        
        System.out.println(result);
    }
}