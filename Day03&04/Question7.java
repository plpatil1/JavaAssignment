/*7. Program to find area and circumference of circle*/
package day0102;
import java.util.Scanner;
public class Question7 {
public static  float pi=3.14f;
public static  float circ;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Radius of Circle: ");
	int r=sc.nextInt();
	
	circ=2*pi*r*r;
	
	System.out.println("Circumference of Circle: "+circ);
	
	
}
}
