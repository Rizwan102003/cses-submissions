import java.util.Scanner;
public class perm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n==1)
            System.out.println(1);
        if(n<=3)
            System.out.println("NO SOLUTION");
        for (int i = 2; i <= n; i=i+2)
            System.out.print(i+" ");
        for (int i = 1; i <= n; i=i+2)
            System.out.print(i+" ");
    }
}