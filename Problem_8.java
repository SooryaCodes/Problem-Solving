import java.util.Scanner;

public class Problem_8 {
    static void print_stars(int i, int n) {
        for (int j = n - 1; j >= i; j--) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            if (k == 0 || k == i - 1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            print_stars(i, n);
        }
        for (int i = n - 1; i >= 1; i--) {
            print_stars(i, n);
        }
    }
}


// Input = 5
//                    *
//                   * *
//                  *   *
//                 *     *
//                *       *
//                 *     *
//                  *   *
//                   * *
//                    *