import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		 char c = sc.next().charAt(0); 
		 int a=(int)c;
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
		    System.out.println("Vowel");
		}
		else if(((a>=97)&&(a<=122))||((a>=65)&&(a<=90)))
		{
		   System.out.println("Consonant"); 
		}
		else
		{
		    System.out.println("invalid");
		}
		
	}
}
