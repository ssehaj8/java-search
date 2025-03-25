import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take user input for string
        System.out.println("Enter input string to reverse: ");
        String str=sc.nextLine();

        String res=reverse(str);
        System.out.println("Reversed string: "+res);
    }

    // Method to reverse a string using StringBuilder
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();

    }
}



/*
I/P -
Enter input string to reverse:
Sehaj
O/P-
Reversed string: jaheS
*/