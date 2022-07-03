public class Task2 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 8, 6, -3, 7, 11, 1};
        int[] result = new int[arr.length];
        int arrLength = arr.length;
        if (arr.length % 2 != 0) {
            int temp = arr.length / 2;
            result[temp] = arr[temp];
        }

        for (int index = 0; index < arr.length / 2; index++) {
            arrLength--;
            result[index] = arr[index];
            result[arrLength] = arr[index];
        }

        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index] + " ");
        }
    }
}
