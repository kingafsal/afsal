import java.io.*;
import java.util.*;
class b2{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i%2==0)
		{
		   System.out.println("Even");
		}
		else if(i%2!=0)
		{
		    System.out.println("Odd");
		}
		else
		{
		    System.out.println("invalid");
		}
	}
}
