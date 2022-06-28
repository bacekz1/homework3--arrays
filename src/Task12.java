import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        //swap positions between arr[0] and arr[1] with third variable
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        //swap position between arr[2] and arr[3] with addition and subtraction
        arr[2] = arr[2] + arr[3];
        arr[3] = arr[2] - arr[3];
        arr[2] = arr[2] - arr[3];

        //swap position between arr[4] and arr[5] with multiplication and division
        arr[4] = arr[4] * arr[5];
        arr[5] = arr[4] / arr[5];
        arr[4] = arr[4] / arr[5];

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
