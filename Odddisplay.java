# Odddisplay
import java.io.*;
import java.util.*;

public class Odddisplay{
 
        public static void main(String[] args)
        {
               Scanner s= new Scanner(System.in);
               int n1=s.nextInt();
               int n2=s.nextInt();
                for(int i=n1; i <= n2; i++)
                {
                  if( i % 2 == 1)
                  {
                  System.out.print(i + " ");
                  }
                }
        }
}
