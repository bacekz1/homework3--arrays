public class Task18 {

    public static void main(String[] args) {
        int[] arr = {18, 19, 32, 1, 3,};
        int[] arr2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int longer;
        int shorter;

        if(arr.length >= arr2.length){
            longer= arr.length;
            shorter  = arr2.length;
        }
        else {
            longer = arr2.length;
            shorter  = arr.length;
        }

        int [] result = new int[longer];

        for (int index = 0; index < shorter; index++) {
            if (arr[index]> arr2[index]){
                result[index] = arr[index];
            }
            else {
                result[index] = arr2[index];
            }
        }

        if(arr.length > arr2.length){

            for (int index = arr2.length-1; index < arr.length; index++) {
                result[index] = arr[index];
            }
        }
        else {
            for (int index = arr.length-1; index < arr2.length; index++) {
                result[index] = arr2[index];
            }
        }

        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index] + " ");
        }

    }
}
