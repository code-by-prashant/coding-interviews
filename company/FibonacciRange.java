package Company;
/* 
    Input: 
    n1 = 20 
    n2 = 100
    Output: 21 34 55 89 
 */

public class FibonacciRange {
    
    static void printFibonacci(long n1, long n2){  

        long prev = 0;
        long current = 1;
        for(long i=0; i<n2; i++)    
        {
            long next = current + prev;
            if (next > n1 && next < n2) {
                System.out.print(next + " "); 
            } 
            prev = current;
            current = next; 
        }  
    }


    public static void main(String[] args) {
        printFibonacci(0, 100);
        System.out.println();
        printFibonacci(20, 100);
    }
}
