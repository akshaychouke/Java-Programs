// Lab 2 Answer

import java.util.*;

class Asterisks{
    
    void printGraph(int arr[])
    {
        for(int i = 0; i <  arr.length; i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Lab2 {

	public static void main(String[] args) {

		Asterisks a = new Asterisks();			//creating object for Asterisks class
		int arr[]=new int[5];				
		Scanner sc = new Scanner (System.in);	
		for(int i=0;i<5;i++)
	    {
	        System.out.print("Please, Enter a number between 1 - 30 ");
	        arr[i]=sc.nextInt();				//getting the user input and storing into an array
	    }
		
		for(int i = 0; i <  arr.length; i++)
        {
            if(!(arr[i]>=0 && arr[i]<=30)) {				//checking whether number is in between 1 to 30
            	System.out.println("The numbers are not in between 1 to 30 ");
            	return;			//if the condition true then it will terminate the whole processes using return keyword.
            }
        }
		
		a.printGraph(arr); 		//calling printGraph method
	}

}
