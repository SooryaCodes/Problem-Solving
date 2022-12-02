import java.util.Scanner;

public class Problem_9 {
    static void print_stars(int i, int n) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {

            if (k == 1 || k == i || i == n) {
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
        for (int i = n; i > 1; i--) {
            print_stars(i, n);
        }

        for (int i = 1; i <= n; i++) {
            print_stars(i, n);
        }
    }
}


// Input = 5
//            * * * * *
//             *     *
//              *   *
//               * *
//                *
//               * *
//              *   *
//             *     *
//            * * * * *