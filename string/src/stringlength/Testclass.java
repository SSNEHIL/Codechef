package stringlength;

import java.util.Scanner;

public class Testclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			int count=0;
			for(int j=1;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("Given Number is " +i+ " Prime");
			}
		}
		
	}

}
