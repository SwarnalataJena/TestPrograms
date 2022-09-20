package StringPrograms;

import java.util.Arrays;

//input [0,0,1,0,1,0,1,1,0]
//output [0,0,0,0,0,1,1,1,1]
public class ArrangingZeroOne {
	public static void main(String[] args) {
		int a[]= {0,0,1,0,1,0,1,1,0};
		int start=0;
		int last=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[start]=a[i];
				start++;
			}
			else
			{
				a[last]=a[i];
				last--;
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
