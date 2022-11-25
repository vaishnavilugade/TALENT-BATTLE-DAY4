//Write a program to identify if the number is even or odd.
import java.util.*;
class Evenodd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n%2==0){
			System.out.println(n+" is even number");
		}
		else{
			System.out.println(n+" is odd number");
		}
	}
}