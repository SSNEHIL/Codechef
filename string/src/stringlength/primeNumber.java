package stringlength;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class primeNumber {
	
	static boolean palindrome(int n,int temp,int sum)
	{
		
		boolean flag=false;
		if(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
			return palindrome(n,temp,sum);
		}
		else if(sum==temp)
		{
		 flag=true;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		int N=123;
		int temp=N;
		int sum=0;
		boolean flag=palindrome(N,temp,sum);
		if(flag==true)
		{
			System.out.println("Given Number is palindrome "+N);
		}
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int num2=sc.nextInt();
		int sum=0;
		for(int i=num1;i<=num2;i++)
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
				sum++;
			}
		}
		System.out.println("Total prime Number in Between "+num1+" and "+num2+" is :"+sum);
*/
		
		//Occurance  of string using resursive 
		  
		  String strng="ajbbsajsbjks1";
		  String ch="j";
		  HashMap<Object,Object> map=new HashMap<Object, Object>();
			int i=0;
		HashMap ma=Occurance(strng,map,i);
		if(ma.containsKey(ch))
		{
		System.out.println(ch+" "+ma.get(ch));
		}
		
		/*String str="MYM MYM MYM";
		String[] str2=str.split(" ");
		String st="";
		for(int i=0;i<str2.length;i++)
		{
			st=st+str2[str2.length-1-i]+" ";
			
		
	}
		if(str.equals(st.trim()))
		{
		System.out.println("given string is palindrome");
		}*/

}

class demo{
	//static Set set=new TreeSet();
	/*static HashMap<Object,Object> map=new HashMap<Object,Object>();
	static int i=0;
	//static int n=1;
	public static HashMap Occurance(String s)
	{
		if(i<s.length())
		{
		if(map.containsKey(s.substring(i, i+1)))
		{
			map.put(s.substring(i, i+1),(Integer)map.get(s.substring(i, i+1))+1);
			i++;
			Occurance(s);
		}
		else
		{
			map.put(s.substring(i, i+1),1);
			i++;
			Occurance(s);
			
		}
		}
		return map;*/
	}

public static  HashMap Occurance(String str,HashMap<Object,Object> map,int i)
{
	if(i<str.length())
	{
	if(map.containsKey(str.substring(i, i+1)))
	{
		map.put(str.substring(i, i+1), (Integer)map.get(str.substring(i, i+1))+1);
		i++;
		return Occurance(str,map,i);
	}
	else
	{
		map.put(str.substring(i, i+1), 1);
		i++;
		return Occurance(str,map,i);
	}
	}
	return map;
	
	
}
}
