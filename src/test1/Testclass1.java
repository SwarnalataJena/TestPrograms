package test1;

import java.util.Scanner;

public class Testclass1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the values");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}

}
