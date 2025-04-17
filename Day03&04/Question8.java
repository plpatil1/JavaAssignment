/*8. Program to calculate sum of 5 subjects & find percentage*/
package day0102;

import java.util.Scanner;

public class Question8 {
	public float perc;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		System.out.println("Enter Five Numbers: ");
		int sum=0;
		for(int i=0; i<5; i++)
		{
			ar[i]=sc.nextInt();
			sum+=ar[i];
		}
		
		float per=(float)sum/500*100;
		System.out.println("Percentage: "+per);
	}

}
