import java.util.Scanner;
class repetitions
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dna = sc.next();
        sc.close();
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == dna.charAt(i - 1)) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}