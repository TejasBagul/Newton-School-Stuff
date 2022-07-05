import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();

            long[] arr = new long[n];
            long sum1 = 0;

            for( int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum1+= arr[i];

            }

            Arrays.sort(arr);
            long sum2 = Integer.MIN_VALUE;

            for( int i = 0; i < n; i++){
                long x = arr[i] * ( n - i);
                sum2 = Math.max( x , sum2);
            }
            System.out.println(sum1 - sum2);

    }
}
// code by Tejas Bagul
