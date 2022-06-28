public class Task17 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 3, 7};
        boolean isZigzag = true;

        for (int index = 0; index < arr.length - 1; index++) {
            if (index % 2 == 0) {

                if (arr[index] >= arr[index + 1]) {
                    isZigzag = false;
                    break;
                }

            } else {

                if (arr[index] <= arr[index + 1]) {
                    isZigzag = false;
                    break;
                }
            }
        }
        System.out.println(isZigzag ? "изпълнява изискванията за зигзагообразна нагоре редица" : "2не изпълнява изискванията за зигзагообразна нагоре редица");


    }
}
