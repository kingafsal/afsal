import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      while(n>0)
      {
          //int a=n%10;
          n=n/10;
          count++;
      }
      System.out.print(count);
    }
}
