//Palindrome:
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        String original,reverse="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome");
        original=in.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equalsIgnoreCase(reverse))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");        
    }
}



