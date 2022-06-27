public class Task8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 3, 5, 5, 5, 5};
        int result = 0;
        int count = 0;

        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] == arr[index + 1]) {
                count++;

                if (count > result) {
                    result = count;
                }

            } else {
                count = 1;
            }
        }
        System.out.println(result);
    }
}
