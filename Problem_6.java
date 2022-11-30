import java.util.Scanner;

public class Problem_6 {

    static void print_stars(int i, int n) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        int p = ((2 * n) - (2 * (i + 1))) - 2;
        for (int k = p; k >= 0; k--) {
            System.out.print("  ");
        }
        for (int j = 0; j <= i; j++) {
            if (j == n - 1) {
                continue;
            }
            System.out.print("* ");

        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            print_stars(i, n);
        }
        for (int i = n - 2; i >= 0; i--) {
            print_stars(i, n);
        }
    }
}
// Input = 5
//        *               *
//        * *           * *
//        * * *       * * *
//        * * * *   * * * *
//        * * * * * * * * *
//        * * * *   * * * *
//        * * *       * * *
//        * *           * *
//        *               *