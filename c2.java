import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String n=sc.nextLine();
      StringBuffer sb=new StringBuffer(n);
      sb.reverse();
      if(n.equals(sb))
      {
          System.out.print("yes");
      }
      else
      System.out.print("no");
         }
}
