
/**
 * Write a description of class FibonnacciRecurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonnacciRecurse
{
    static int fib(int n) {
        if( n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
public static void main(String[] args) {
        if(args.length != 1) {
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }

}
