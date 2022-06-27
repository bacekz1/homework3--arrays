public class Task2 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 8, 6, -3, 7, 11};
        int[] result = new int[arr.length];
        int count = arr.length;

        for (int index = 0; index < arr.length / 2; index++) {
            count--;
            result[index] = arr[index];
            result[count] = arr[index];
        }

        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index] + " ");
        }
    }
}
