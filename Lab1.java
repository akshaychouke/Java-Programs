// Lab Q,1 Answer 

import java.util.*;
import java.io.*;


class Demo{

     static void Box()
    {  System.out.println("The Shape for Box is : ");
        
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
    }
    
    static void Oval()
    {
    System.out.println("The Shape for Oval is : ");
    
    System.out.println("  *** ");
    System.out.println("*     *");
    System.out.println("*     *");
    System.out.println("*     *"); 
    System.out.println("*     *"); 
    System.out.println("*     *");
    System.out.println("  *** ");
    }
    
    static void Arrow()
    {
    System.out.println("The Shape for Arrow is : ");
    
    System.out.println("  * ");
    System.out.println(" ***");
    System.out.println("*****");
    System.out.println("  * ");
    System.out.println("  * ");
    System.out.println("  * ");
    System.out.println("  * ");
    System.out.println("  * ");
    }
    
    static void Daimond(){
    System.out.println("The Shape for Daimond is : ");
    System.out.println("       *");
    System.out.println("    *     *");
    System.out.println("  *         *");
    System.out.println("*             *");
    System.out.println("*             *");
    System.out.println("*             *");
    System.out.println(" *           *");
    System.out.println("    *     *");
    System.out.println("       *");    
    }
}

public class Lab1
{
   	public static void main(String[] args)
	{
	Demo.Box();
	
	Demo.Oval();
	
	Demo.Arrow();
	
	Demo.Daimond();
	}
}

