import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       char c=sc.next().charAt(0);
       int a=(int)c;
       if(((a>=97)&&(a<=122))||((a>=65)&&(a<=90)))
       System.out.print("Alphabet");
       else
       System.out.print("No");
	}
}
