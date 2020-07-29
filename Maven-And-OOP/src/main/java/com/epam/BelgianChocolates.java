package com.epam;

public class BelgianChocolates extends Chocolates{
	private float belgian_cost;
	   private int no_of_belgian;
	   BelgianChocolates(String name_of_candy,int no_of_belgian,float belgian_cost)
	     {
	        super(name_of_candy);
	        this.no_of_belgian=no_of_belgian;
	        this.belgian_cost=belgian_cost;
	     }
	 public float cost()
	  {
	     float c=(float)(no_of_belgian)*(belgian_cost);
	     return c;
	  }
}