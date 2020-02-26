package stringlength;

import java.awt.Robot;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;
/*import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;*/

public class Democode{

	static int i=0;
	Democode()
	{
		System.out.println(i);
		i++;
		
	}
	
	
	
		/* Prime_Number
		 * 
		 * Scanner sc=new Scanner(System.in); String str=sc.nextLine(); String[]
		 * str2=str.split(" "); int[] a=new int[str2.length]; for(int
		 * i=0;i<str2.length;i++) { a[i]=str2[i].length(); } for(int
		 * j=0;j<str2.length;j++) { for(int k=0;k<str2.length-j-1;k++) { String temp="";
		 * if(str2[k].length()>str2[k+1].length()) { temp=str2[k]; str2[k+1]=str2[k];
		 * str2[k]=temp; } } }
		 * System.out.println("MAX length of string is : "+str2[str2.length-1]);
		 */
		
		/*palindrome
		 * 
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter Number:"); int
		 * N=sc.nextInt(); int temp=N; int sum=0; while(N>0) { int r=N%10; sum=sum*10+r;
		 * N=N/10;
		 * 
		 * } if(sum==temp) { System.out.println("Number is palindrome"); }
		 */
		@Test(enabled=true)
		public void base()
		{
			//System.out.println(Arrays.toString(dt));
			Democode dt=new Democode();
			Democode dt1=new Democode();
			System.out.println("I am in 000Test class");
			int[] a={1,3,5,1,4};
			for(int i=0;i<a.length;i++)
			{
				int found=1;
				for(int j=i+1;j<a.length;j++)
				{
					try {
						if(a[i]==a[j])
						{
							a[j]=' ';
							found++;
							
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("Null found in array");
					}
				}
				if(a[i]!=' ')
				{
					System.out.println("Element found "+a[i]+" Occurance in array "+found);
				}
				
			}
			for(int k:a)
			{
			System.out.println("element is "+k);
			}
		}
		@Test
		public void act()
		{
			String str="s1ne89hi3l";
			/*String rev="";
			for(int i=(str.length()-1);i>=0;i--)
			{
				rev=rev+str.substring(i,i+1);
				
			}
			System.out.println(rev);*/
	      char[] ch=str.toCharArray();
	      int sum=0;
	      for(int i=0;i<str.length();i++)
	      {
	    	  String stv="";
	    	  int found=0;
	    	  try{
	    	  int num=Integer.parseInt(str.substring(i, i+1));
	    	  System.out.println("print number"+num);
	    	  found++;
	    	  while(found>0)
	    	  {
	    		  stv=stv+num;
	    		  found--;
	    		  i++;
	    		  try{
	    		  num=Integer.parseInt(str.substring(i,i+1));
	    		  found++;
	    		  }
	    		  catch(Exception e)
	    		  {
	    			 sum=sum+Integer.parseInt(stv); 
	    			 System.out.println(sum);
	    		  }
	    		  
	    	  }
	    	  }
	    	  catch(Exception e)
	    	  {
	    		  
	    	  }
	      }
	      System.out.println("Sum of Number in given String is"+sum);
	
		}
		@Test(priority=-1)
		public void aact()
		{
			/*
			System.out.println("I am in 00-1Test class");
			int[] a={2,3,5,9,7,8,1,0,4,5,6,7,8,9,1,89,91,92};
			String[] str1=new String[a.length];
			for(int i=0;i<a.length-1;i++)
			{
				String str="";
				try {
					while(a[i]<a[i+1])
					{
						str=str+a[i];
						i++;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				str=str+a[i];
				str1[i]=str;
			}
			System.out.println(Arrays.toString(str1));*/
			String str="CoCC121mmunic1ati100on";
			Set set=new TreeSet();
			HashMap<Object, Object> map=new HashMap<Object, Object>();
			int sum=0;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.toLowerCase().charAt(i);
				if(ch=='a' || ch== 'e' || ch=='i' || ch=='o'||ch=='u')
				{
					set.add(ch);
				}
			
			/*for(int i=0;i<str.length();i++)
			{
				int found=0;
				String num="";
				try{
				Integer k=Integer.parseInt(str.substring(i,i+1));
				num=num+k;
				found++;
				while(found>0)
				{
					
					i++;
					try{
				     k=Integer.parseInt(str.substring(i,i+1));
				     num=num+k;
				     found++;
					}
					catch(Exception e)
					{
						found--;
					}
					
				}
				sum=sum+Integer.parseInt(num);
				set.add(k);
				}
				catch(Exception e)
				{
					
				}*/
				/*int n=1;
				if(set.add(str.substring(i, i+1))==false)
				{
					
					map.put(str.substring(i, i+1),(Integer) map.get(str.substring(i, i+1))+1);
				}
				else
				{
					map.put(str.substring(i, i+1), n);
				}*/
			
			}
			System.out.println(set);
			//System.out.println(sum);
		}
		@Test
		public void sdtfg()
		{
			System.out.println("I am in 002 Test class");
			String str1="aaaabcadeefgha";
			char[] ch=str1.toCharArray();
			//HashMap map=new HashMap();
			String str="";
			char temp=0;
			for(int i=0;i<ch.length-1;i++)
			{
				int found=1;
				
				if(ch[i]!=0){
				for(int j=i+1;j<ch.length;j++)
				{
				if(ch[i]==ch[j])
				{
					ch[j]=0;
					found++;
				}
				}
		
				str=str+ch[i]+found;
				
				}
			}
			System.out.println("New String is :"+str);
			System.out.println("Given string length"+str1.length());
			System.out.println("New String length"+str.length());
			
		/*	for(int i=0;i<ch.length;i++)
			{
				int found=1;
				if(ch[i]!=0){
				for(int j=i+1;j<ch.length-1;j++)
				{
				if(ch[i]==ch[j])
				{
					ch[i]='\0';
					found++;
					
				}
				}
				System.out.println("Repetead char "+ch[i]+" in String"+found);
				}
				
			}*/
		}
		  
		  
		  
		
		/*Selenium_code_broken_link
		 * 
		 * 
		 * By web=By.
		 * xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]"
		 * ); By web2=By.
		 * xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[2]"
		 * ); By find_trains=By.xpath("//div/button[@label='Find Trains']");
		 * System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
		 * FirefoxProfile profile = new FirefoxProfile();
		 * profile.setPreference("permissions.default.desktop-notification", 1);
		 * DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		 * capabilities.setCapability(FirefoxDriver.PROFILE, profile); WebDriver
		 * driver=new FirefoxDriver(capabilities); driver.get("https://www.google.com");
		 * Thread.sleep(500); List<WebElement>
		 * Weblist=driver.findElements(By.tagName("a")); for(WebElement link:Weblist) {
		 * System.out.println(link.getText()); getlink(link.getAttribute("href"));
		 * 
		 * }
		 */
		  
		  
		  
		/*
		 * System.out.println("Title Page "+driver.getTitle());
		 * driver.findElement(web).sendKeys("ypr"); Thread.sleep(500);
		 * driver.findElement(web).sendKeys(Keys.ENTER); Thread.sleep(500);
		 * driver.findElement(web2).sendKeys("bgp"); Thread.sleep(5000);
		 * driver.findElement(web2).sendKeys(Keys.ENTER); Thread.sleep(500);
		 * driver.findElement(find_trains).sendKeys(Keys.ENTER); Thread.sleep(5000);
		 * driver.close();
		 */
		 
		 
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter a Number"); int
		 * n=sc.nextInt(); int temp=n; int sum=0; while(n>0) { int r=n%10;
		 * sum=sum+r*r*r; n=n/10;
		 * 
		 * } if(temp==sum) { System.out.println("Given number "+temp+" is armstrong"); }
		 */
		
		
		
		/*fib0nnaci series
		 * 
		 * int n=10; int n1=0; int n2=1; int n3=0; int count=1; fun(n,n1,n2,n3,count);
		 */
		
		//length of String 
		  
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter Any String");
		 * String str=sc.nextLine(); char[] ch=str.toCharArray(); int i=0; int j=0; try
		 * { while(ch[i]!='\0') { if(ch[i]!=' ') i++; else { i++; j++; } } } catch
		 * (Exception e) { // TODO Auto-generated catch block
		 * System.out.println("Length of String is :"+(i-j)+"\n White Space :"+j);
		 * System.out.println("Validation of String length: "+(str.length()==i)); }
		 */
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter String with white Space-bar"); String
		 * str=sc.nextLine(); String[] st=str.split(" "); for(int i=0;i<st.length;i++) {
		 * String temp=""; try { if(st[i].length()>st[i+1].length()) { temp=st[i];
		 * st[i]=st[i+1]; st[i+1]=temp; } } catch(Exception e) {
		 * System.out.println("Max String length "+st[i]+" is "+st[i].length()); } }
		 */
		
		/*sTRING TO CHAR CONVERSION
		 * 
		 * 
		 * 
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter Char Element one by One:"); String str="";
		 * str=str+sc.next(); int i=0; char[] ch=str.toCharArray();
		 * System.out.print(Arrays.toString(ch));
		 */
		
		
		
		/*Bubble sort
		 * 
		 * 
		 * for(int j=0;j<a.length;j++) { for(int k=0;k<a.length-1-j;k++) {
		 * if(a[k]>a[k+1]) { int temp=a[k]; a[k]=a[k+1]; a[k+1]=temp; } }
		 * System.out.print(" "+a[a.length-1-j]); }
		 */
		
		/*Insertion sort
		 * 
		 * 
		 *
		 * for(int j=0;j<a.length-1;j++) { for(int k=j+1;k>0;k--) { int temp=a[k];
		 * if(a[k]<a[k-1]) {
		 * 
		 * a[k]=a[k-1]; a[k-1]=temp;
		 * 
		 * } } System.out.print(Arrays.toString(a)); } System.out.println();
		 */
		
		/*Binary Search
		 * 
		 * 
		 * Data d=new Data(); //Scanner sc=new Scanner(System.in); int[] a= {1}; int
		 * l=d.m(a,1); if(l<0) { System.out.println("Elemnt not found"); }
		 */
		
		
		
	
	/*
	 * public static void fun(int i,int n1,int n2,int n3,int count) { if(count<3) {
	 * System.out.print(" "+n3); n3=n1+n2; fun(i,n1,n2,n3,count+1); } else
	 * if(count<=i) {
	 * 
	 * n3=n1+n2; n1=n2; n2=n3; System.out.print(" "+n3); fun(i,n1,n2,n3,count+1); }
	 * 
	 * }
	 */
	
	/*Broken_Link
	 * 
	 * public static void getlink(String str) throws IOException { URL url=new
	 * URL(str); HttpURLConnection http=(HttpURLConnection)url.openConnection();
	 * http.setConnectTimeout(3000); if(http.getResponseCode()==200) {
	 * System.out.println(str+"....:"+http.getResponseMessage()); } else {
	 * System.out.println(str+".....:"+http.getResponseMessage()); } }
	 */



/*Binary search
 * 
 * 
 * 
 *
 * class Data { Data d; private int a=20; int m(int[] k,int data) { int[] j=k;
 * System.out.println(Arrays.toString(j)); int l=0,r=j.length-1; int
 * mid=(l+r)/2; while(l<=r) { if(data==j[mid]) {
 * System.out.println("Element found at index :"+(mid+1)); return mid; } else
 * if(data<j[mid]) { r=mid-1; mid=(l+r)/2; } else { l=mid+1; mid=(l+r)/2; } }
 * return -1;
 * 
 * }
 * 
 * }
 */}