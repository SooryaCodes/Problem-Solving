import java.util.Scanner;

public class Problem_7 {

    static void print_char(int i, int n, boolean status) {
        int j = status ? n : i;
        for (int k = 0; k < i; k++) {
            for (int z = 0; z < j; z++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 2; i++) {
            if (i != 1) {
                print_char(i, n, false);
            }
            print_char(i, n, true);
        }
    }
}

// Input = 5
//        X X X X X
//        X X
//        X X
//        X X X X X
//        X X X X X
//        X X X
//        X X X
//        X X X X X
//        X X X X X
//        X X X X X
