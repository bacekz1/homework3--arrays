public class Task15 {
    public static void main(String[] args) {

        double[] arr = {-50.4, 11.15, 99.65165, 15.8, 22.6, -185.6};

        double big = 0;
        double bigger = 0;
        double biggest = 0;

        for (int index = 0; index < arr.length; index++) {
            double currentNum = arr[index];

            if (Math.abs(currentNum) > Math.abs(biggest)) {
                bigger = biggest;
                biggest = arr[index];
            }

            if (Math.abs(currentNum) < Math.abs(biggest) && Math.abs(currentNum) > Math.abs(bigger)) {
                big = bigger;
                bigger = arr[index];
            }

            if (Math.abs(currentNum) < Math.abs(bigger) && Math.abs(currentNum) > Math.abs(big)) {
                big = currentNum;
            }

        }

        System.out.printf("%f; %f; %f", big, bigger, biggest);
    }
}
