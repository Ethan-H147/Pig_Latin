import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String letter;
    letter = word.substring(0, 1);
    String s = word.substring(1);
    System.out.print(s+letter+"ay");
    }

}   