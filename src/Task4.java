public class Task4 {
    public static void main(String[] args) {
        int [] arr = {6, 27, -1, 5, 7, 7, 5, -1, 27, 6};
        int arrLength = arr.length;
        boolean isMirror = true;

        for (int index = 0; index < arr.length; index++) {
            arrLength--;
            if (arr[index] != arr[arrLength]){
                isMirror = false;
                break;
            }
        }
        System.out.print(isMirror ? "The arr is mirrored" : "The arr isn`t mirror");
    }
}
