import java.util.*;
public class Tower_Of_Hanoi {
    static List<String> moves = new ArrayList<>();
    public static void solve(int n, int source, int helper, int destination) {
        if (n == 0) return;

        // Move n-1 disks from source to helper
        solve(n - 1, source, destination, helper);

        // Move the nth disk from source to destination
        moves.add(source + " " + destination);

        // Move the n-1 disks from helper to destination
        solve(n - 1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, 1, 2, 3);  // 1: source, 2: helper, 3: destination
        System.out.println(moves.size());
        for (String move : moves)
            System.out.println(move);
    }
}