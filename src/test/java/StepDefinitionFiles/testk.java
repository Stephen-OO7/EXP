package StepDefinitionFiles;


import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class testk {
	

	public static void main(String[] args) 
	{
		
	String str1="Bad boy Boy good bAd boy";
	String arr[]=str1.split(" ");
for(int i=0;i<arr.length;i++)
{
	

	for(int j=i+1;j<=arr.length-1;j++)
	{
		String str3=arr[i].toLowerCase();
		String str4=arr[j].toLowerCase();
		
	if(str3.equals(str4))
	{
		System.out.println(arr[i]);
	}
	
}
}

	}
	}


