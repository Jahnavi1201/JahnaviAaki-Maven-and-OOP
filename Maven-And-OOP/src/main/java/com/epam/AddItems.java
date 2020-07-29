package com.epam;
public class AddItems {
    float c[]=new float[100];
	int i=0,j=0;
	public void addChocolates(float c)
	{
		this.c[i++]=c;
	}
	String s[]=new String[100];
	float sw[]=new float[100];
	public void addSweets(float s,String name)
	{
		String sweet=name+" ----> "+String.valueOf(s);
		this.s[j]=sweet;
		sw[j]=s;
		j++;
	}
	public void sort()
	{
		for(int k=0;k<i-1;k++)
		{
			for(int l=0;l<i-k-1;l++)
			{
				if(c[l]>c[l+1])
				{
					float temp=c[l];
					c[l]=c[l+1];
					c[l+1]=temp;
				}
			}
		}
	}
	public void display()
	{
		System.out.println("Sweets price in between 0 to 500");
		int flag=0;
		for(int k=0;k<j;k++)
		{
			if(sw[k]<1000)
			{		
			    System.out.println(s[k]);
			    flag=1;
			}
		}
		if(flag==0)
			System.out.println("No sweets between 0 to 1000");
		System.out.println();
	}
}