import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] arr = new int[10];
        arr [0] = num;
        arr [1] = num;

        for (int index = 1; index < arr.length-1; index++) {
            arr[index+1] = arr[index-1] +arr[index];

        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }

    }
}
