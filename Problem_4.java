import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        System.out.println("Enter array limit : ");
        int limit = sc.nextInt();
        System.out.println("Enter array elements : \n");
        int[] arr = new int[50];
        for (int i = 0; i < limit; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < limit; i++) {
            if (arr[i]== 0){
                continue;
            }
            else if (arr[i] % 2 == 0) {
                even++;
            } else if (arr[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.println("Count of zeros in the array is " + (limit - (even+odd)));
        System.out.println("Count of even numbers in the array is " + even);
        System.out.println("Count of odd numbers in the array is " + odd);
    }
}

//        Enter array limit :
//        10
//        Enter array elements :
//        1 2 3 4 5 6 7 0 8 0
//        Count of zeros in the array is 2
//        Count of even numbers in the array is 4
//        Count of odd numbers in the array is 4
