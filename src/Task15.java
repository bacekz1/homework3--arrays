public class Task15 {
    public static void main(String[] args) {


        double[] arr = {-50.4, 11.15, 99.65165, 15.8, 22.6};
        double big = Double.MIN_VALUE;
        double bigger = Double.MIN_VALUE;
        double biggest = Double.MIN_VALUE;

        for (int index = 0; index < arr.length; index++) {
            double currentNum =  arr[index];
             if (Math.abs(currentNum) > Math.abs(biggest)){
                 bigger = biggest;
                 biggest = currentNum;
             }
             if ( Math.abs(currentNum) < Math.abs(bigger) && Math.abs(currentNum) > Math.abs(big)){
                 big = currentNum;
             }

        }
        System.out.printf("%f; %f; %f", big, bigger, biggest);
    }
}
