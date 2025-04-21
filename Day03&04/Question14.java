package day0102;
import java.util.Scanner;
public class Question14 {
public static void main(String[] args) {
		System.out.println("Enter Number to Reverse it: ");
		Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=0;
	int ans=0;
	System.out.println("Bfore Reversing Number: "+num);
	while(!(num<=1)) {
		n=num%10;
		ans=ans*10+n;
		num=num/10;
	}
	System.out.println("After Reversing Number: "+ans);
	}
}
