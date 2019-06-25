import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n%400==0||n%4==0)
      {
          System.out.println("yes");
      }
      else if(n%100==0) 
      {
          System.out.println("no");
      }
          else{
              System.out.print("no");
          }
      }
    }
