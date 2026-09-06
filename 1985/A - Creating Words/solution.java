import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
 
            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);
 
            sb.append(newA).append(" ").append(newB).append("
");
        }
 
        System.out.print(sb);
        scanner.close();
    }
}