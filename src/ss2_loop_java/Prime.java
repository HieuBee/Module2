package ss2_loop_java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = s.nextInt();
        int N = 2;
        int count = 0;
        while (count < number){
            boolean isPrime = true;
            for (int i = 2 ; i < N ; i++){
                if (N % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
