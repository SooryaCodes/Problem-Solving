import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        //For printing rows
        for (int i = 1; i <= n; i++) {
            //For printing spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            //For printing stars
            for(int k = 1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Input = 5
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *