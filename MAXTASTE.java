package CODECHEF;
import java.util.Scanner;

public class MAXTASTE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0)
        {
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();
            int m1 = (a>b)?a:b;
            int m2 = (c>d)?c:d;
            System.out.println(m1+m2);
        }
    }
}
