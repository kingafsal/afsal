import java.io.*;
import java.util.*;
class b1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
		    System.out.print("Positive");
		}
		else if(n<0)
		System.out.print("Negative");
		else
		System.out.print("Zero");
	}
}
