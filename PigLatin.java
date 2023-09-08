import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String phrase;
    phrase = scan.nextLine();
    int length = phrase.length();
    for(int i=0; i<length;i++){
    phrase.substring(i, i+1);
    }
    }
}