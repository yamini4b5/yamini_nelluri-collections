package epam.collections;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
    	CustomArrayList customarraylist =new CustomArrayList();
    	System.out.println("Intializing with 10 Integers");
    	customarraylist.adding(new Integer(1));
    	customarraylist.adding(new Integer(2));
    	customarraylist.adding(new Integer(3));
    	customarraylist.adding(new Integer(4));
    	customarraylist.adding(new Integer(5));
    	customarraylist.adding(new Integer(6));
    	customarraylist.adding(new Integer(7));
    	customarraylist.adding(new Integer(8));
    	customarraylist.adding(new Integer(9));
    	customarraylist.adding(new Integer(10));
    	System.out.print("All Elements in list after adding ");
        System.out.println(customarraylist);
        System.out.println("Enter how many elements you want to remove");
        int removeelements  = in.nextInt();
    	for(int i = 0; i < removeelements; i++) {
    		System.out.println("Enter the index you want to remove");
    		int n = in.nextInt();
    		customarraylist.remove(n);
    	}
    	System.out.println(" All the elemnets in the list after Removing");
    	System.out.println(customarraylist);
    	
    	System.out.println("Enter how many elements you want to fetch");
    	int fetchelements  = in.nextInt();
    	for(int i = 0; i < fetchelements; i++) {
    		System.out.println("Enter the elemen you want to fetch");
    		int n = in.nextInt();
    		customarraylist.fetching(n);
    	}  	
    	
    	System.out.print("All Elements in list after fetching ");
        System.out.println(customarraylist);
    	System.out.println("Fectching");
    	
      System.out.print("All Elements in list are ");
       System.out.println(customarraylist);
       System.out.println("Number of elements in list are:"+customarraylist.size());
        
    }
}