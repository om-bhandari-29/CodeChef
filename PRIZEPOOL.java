package CODECHEF;
import java.util.Scanner;

public class PRIZEPOOL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int a = s.nextInt(), b = s.nextInt();
            System.out.println((a*10)+(b*90));
        }

    }
}
