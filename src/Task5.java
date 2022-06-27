public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = index * 3;
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
