public class Task7 {
    public static void main(String[] args) {

        int[] arr = {6, 27, -1, 5, 7, 7, 5, -1, 27, 6};
        int[] arr2 = new int[arr.length];
        arr2[0] = arr[0];
        arr2[arr2.length - 1] = arr[arr.length - 1];

        if(arr.length != arr2.length){
            System.out.print("exception");
        }
        else {

            for (int index = 1; index < arr.length -1; index++) {
                arr2 [index] = arr [index-1] + arr [index+1];
            }

            for (int index = 0; index < arr2.length; index++) {
                System.out.print(arr2[index] + " ");
            }
        }


    }
}
