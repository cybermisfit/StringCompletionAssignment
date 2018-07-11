import java.util.Scanner;


public class PetQuestions
{
    public static void main( String[] args )
    {
        //Scanner keyboard - initialize the scanner to your program
        Scanner keyboard = new Scanner (System.in);


        //Variable names
        String name;
        String breed;
        int age;

        //Print out interactive text
        System.out.print( "Greetings. What is your pet's name? " );

        //Returns the pet's name
        name = keyboard.next();

        //Print out interactive text
        System.out.print( "What kind of animal is " + name + "? " );

        //Returns the pet's breed
        breed = keyboard.next();

        //Print out interactive text be
        System.out.print( "How old is " + name + "? ");

        //Returns how old the pet is
        age = keyboard.nextInt();

        //Print out interactive text, name of breed, etc.
        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
