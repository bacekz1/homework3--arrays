import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[7];
        int count = 0;

        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 5 == 0 && arr[index] > 5){
                System.out.print(arr[index] + ",");
                count++;
            }
        }

        System.out.print(" - " + count + "числа");
    }
}
