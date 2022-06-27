import static java.lang.Integer.MAX_VALUE;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 8, 6, -3, 7};
        int result = MAX_VALUE;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 3 == 0 && arr[index] < result) {
                result = arr[index];
            }
        }
        System.out.print(result);
    }
}
