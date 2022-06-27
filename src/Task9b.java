public class Task9b {
    public static void main(String[] args) {

        //solution w/o additional array
        int[] arr = {1, 2, 3, 4, 5};
        int currentIndex;
        int count = arr.length - 1;

        for (int index = 0; index < arr.length / 2; index++) {
            currentIndex = arr[index];
            arr[index] = arr[count];
            arr[count] = currentIndex;
            count--;
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
