import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    int index=0;
    char c;
    do{
        c = word.charAt(index);
        index++;
    }
    while(!isVowel(c));
    String firstCon;
    firstCon = word.substring(0, index-1);
    String s = word.substring(index-1);
    System.out.print(s+firstCon+"ay");
    }

public static boolean isVowel(char c){
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        return true;
    }
    return false;
}
}   