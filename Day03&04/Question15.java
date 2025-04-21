/*15.	In a company an employee is paid as under:
If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary 
and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500
and DA = 98% of basic salary.
If the employee's salary is input by the user write a program to find his gross salary. GS=Basic+DA+HRA
*/
package day0104;
import java.util.*;
public class Question15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary: ");
		float bsal=sc.nextFloat();
		float DA=0,HRA=0, Gsal=0;
		if(bsal<1500) {
			DA=(float) ((bsal)*(0.90));
			HRA=(float) ((bsal)*(0.10));
			
		} else if(bsal>=1500) {
			DA=(float) ((bsal)*(0.98));
			HRA=500;
			
		}
		Gsal=bsal+HRA+DA;
		System.out.println("Gross Salary: "+Gsal);
	}

}
