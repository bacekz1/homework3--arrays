//
//import java.util.Scanner;
//
//public class Task10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[7];
//        double average = 0;
//        int result = 0;
//
//        for (int index = 0; index < arr.length; index++) {
//            arr[index] = sc.nextInt();
//            average += arr[index];
//        }
//
//        average /= arr.length;
//        double temp = Integer.MAX_VALUE;
//
//        for (int index = 0; index < arr.length; index++) {
//
//            if (arr[index] - average == 0) {
//                result = arr[index];
//                break;
//            }
//
//            if (Math.abs(arr[index] - average) < temp) {
//                temp = Math.abs(arr[index] - average);
//                result = arr[index];
//            }
//        }
//        System.out.println(average);
//        System.out.println(result);
//    }
//}
