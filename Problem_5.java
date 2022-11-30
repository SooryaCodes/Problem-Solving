import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j%2==0?"* ":i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//        1
//        2 *
//        3 * 3
//        4 * 4 *
//        5 * 5 * 5
//        6 * 6 * 6 *
