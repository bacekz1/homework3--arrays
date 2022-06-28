import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPositiveNum = true;

        if (num < 0) {
            isPositiveNum = false;
            num *= -1;
        }

        int temp = num;
        int count = 0;

        while (temp > 0) {
            temp /= 2;
            count++;
        }

        //не се бях сетил. Видях го в решенията в книгата
        if(num == 0){
            count++;
        }

        int[] arr = new int[count];

        for (int index = 0; index < arr.length; index++) {
            if (num % 2 == 0) {
                arr[arr.length - 1 - index] = 0;
            } else {
                arr[arr.length - 1 - index] = 1;
            }
            num /= 2;
        }

        System.out.print(isPositiveNum ? "" : "-");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]);
        }

    }
}
