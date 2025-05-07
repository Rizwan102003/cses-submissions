import java.util.Scanner;
class Trailing_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long count = 0;
        for (long i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        System.out.println(count);
    }
}

//process 2:(gate)
/*
import java.util.Scanner;
class Trailing_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long count = 0;
        while (n > 4) {
            n /= 5;
            count += n;
        }
        System.out.println(count);
    }
}
 */
// This code calculates the number of trailing zeros in n! (n factorial) by counting the number of factors of 5 in the numbers from 1 to n.
// The number of trailing zeros in n! is determined by the number of times 10 is a factor in the product, and since 10 = 2 * 5, we only need to count the number of factors of 5, as there are always more factors of 2 than factors of 5.
// The code uses a loop to divide n by powers of 5 (5, 25, 125, etc.) and adds the quotient to the count until n / i is less than 1. Finally, it prints the total count of trailing zeros.
// The time complexity of this code is O(log n) because the loop runs for log base 5 of n iterations, and the space complexity is O(1) since it uses a constant amount of space.
// The code is efficient and works well for large values of n, up to 10^18, as required by the problem statement.