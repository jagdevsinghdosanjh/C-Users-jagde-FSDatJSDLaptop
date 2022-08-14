import java.util.*;
public class PalindromOrNot {
	public static void main(String[] args) 
	{
		int num,t,s,r;
		System.out.println("--------- Palindrom or Not Palindrome---------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		num=sc.nextInt();
		t=num;
		for(s=0;num>0;num/=10)
		{
			r=num%10;
			s=(s*10)+r;
		}
		if(s==t)
			System.out.println(t+" is a palindrome number ");
		else
			System.out.println(t+" is not a palindrome number ");
		sc.close();
	}
}