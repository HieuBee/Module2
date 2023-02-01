package ss2_loop_java;

public class PrimeNumbersLessThanOneHundred {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100){
            boolean isPrime = true;
            for (int i = 2 ; i < N ; i++){
                if (N % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(N);
            }
            N++;
        }
    }
}
