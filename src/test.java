public class test {
    public static void main(String[] args) {
//        int a = 15;
//        int b = -6;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        //TODO
////        a ^= b;
////        b ^= a;
////        a ^= b;
//
//
//
////        a = a * b;
////        b = a / b;
////        a = a / b;
//        System.out.println(a);
//        System.out.println(b);


//        System.out.println(99 % 2);

        double[] arr = {-5.0, 11.15, 88.48, 99.65165, 15.8, 22.6};
        double big = Double.MIN_VALUE;
        double bigger = Double.MIN_VALUE;
        double biggest = Double.MIN_VALUE;

        for (int index = 0; index < arr.length; index++) {
            double currentNum = arr[index];

            if (biggest > currentNum && bigger > currentNum && big < currentNum ){
                big = currentNum;
            }
            if (biggest > currentNum && bigger < currentNum){
                bigger = currentNum;
            }

            if (currentNum> biggest){
                biggest = currentNum;

//            for (int i = 0; i < arr.length; i++) {
//                if (index == 2){
//                    break;
//                }
//
//                }
            }
        }
        System.out.println(big);
        System.out.println(bigger);
        System.out.println(biggest);
    }
}
