public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        boolean isEqual = true;

        if (arr.length != arr2.length) {
            System.out.println("The arrays aren`t equal");
            System.out.println("The arrays have different length");
            System.exit(0);
        } else {
            System.out.println("The arrays have same length");
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != arr2[index]) {
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual ? "The arrays are equal" : "The arrays aren`t equal");
    }
}
