package com.GL.PayMoney.Lab2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Size of the Transaction array
		System.out.println("Enter the size of transaction array");
        int size= sc.nextInt();
        
        //Values in the array
         System.out.println("Enter the values of array"); 
         int []transactions=new int[size];
         for(int i=0; i < size; i++) {
        	 transactions[i]=sc.nextInt();
         }
        
         //Target to be achieved
        System.out.println("Enter the total no of targets that needs to be achieved");
        int targets=sc.nextInt();
        //if 2 targets an array of 2 and it will store the values of the target
        for(int j=0; j<targets; j++) {
        	 System.out.println("Enter the value of target");
        	 int targetValue=sc.nextInt();
     	
        Targets.targetAchieved(targetValue,transactions);

        }
         
	}

}
