public class Task14 {
    public static void main(String[] args) {
        double[] arr = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 , 2.999};
        int count = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]>-2.99 && arr[index]<2.99){
                count++;
            }
        }

        double [] result = new double[count];
        count = 0;
        for (int index = 0; index  <arr.length ; index ++) {
            if (arr[index]>-2.99 && arr[index]<2.99){
                result[count] = arr[index];
                count++;
                System.out.print(arr[index] + "; ");
            }
        }
    }
}
