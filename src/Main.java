import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        // Time for input!
        Scanner keyb = new Scanner(System.in);

        System.out.print("What's your favorite number? ");
        int num = keyb.nextInt();

        System.out.println(num + " is a lucky number!");

        //Garbage collection
        keyb.nextLine();
        //necessary anytime you want/need to input w/nextLine AFTER
        //    ANY OTHER INPUT (next-whatever)

        // reading in Strings
        //2 ways:  next and nextLine
        //  next:  grabs a single "word"
        //  nextLine:  processes all information up to AND INCLUDING
        //              THE END-OF-LINE
        System.out.println("Please enter your name: ");
        String name = keyb.nextLine();
        System.out.println("Nice to meet you, " + name);

        // Examining the input buffer a tad more deeply
        System.out.print("Enter 3 integers: ");
        int val1 = keyb.nextInt();
        int val2 = keyb.nextInt();
        int val3 = keyb.nextInt();
        System.out.println("The sum of which is: " +(val3+val1+val2));

        Scanner inFile = new Scanner(new File("in.dat"));
        val1 = inFile.nextInt();
        val2 = inFile.nextInt();
        val3 = inFile.nextInt();
        System.out.println("The sum of which is: " +(val3+val1+val2));

    }
}