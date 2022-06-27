public class Task9a {
    public static void main(String[] args) {

        //solution with additional array
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length];

        for (int index = 0; index < arr.length; index++) {
            arr2[arr2.length - 1 - index] = arr[index];
        }
        for (int index = 0; index < arr2.length; index++) {
            System.out.print(arr2[index] + " ");
        }

    }
}
