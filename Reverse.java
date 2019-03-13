
/**
 * A guess the word program.
 *
 * @author Melissa Rios
 * @version 11/20/18
 */
public class Reverse
{
    public static final String SECRET_PASSWORD= "SHEEP";
    
    static String obfuscate(String input){
        return input.replace('P', 'p').replace('S', 's');
    }
    public static void main(String [] args) {
        if(args.length !=1)
        {
         System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>");
         return;
        }
        
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
         System.out.println("You win! Congratulations!");   
        }
        else
        {
            System.out.println("Wrong password! Try again!");
        }
    }
}
