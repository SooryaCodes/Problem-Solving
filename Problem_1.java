import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Input = 5
//         *
//         * *
//         * * *
//         * * * *
//         * * * * *
