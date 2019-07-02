import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
    int n=sc.nextInt();
      int a[]=new int[n];
      int b=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(int i=0;i<b;i++)
      {
          sum+=a[i];
      }
  System.out.print(sum);
    
    }
}
