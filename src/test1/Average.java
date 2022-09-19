package test1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the values");
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Average of array is :");
		double avg=sum/a.length;
		System.out.println(avg);
		
	}

}
