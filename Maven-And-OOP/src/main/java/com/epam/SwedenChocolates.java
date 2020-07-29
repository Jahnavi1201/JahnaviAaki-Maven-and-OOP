package com.epam;

public class SwedenChocolates extends Chocolates{
	private float sweden_cost;
	   private int no_of_sweden;
	   SwedenChocolates(String name_of_candy,int no_of_sweden,float sweden_cost)
	     {
	        super(name_of_candy);
	        this.no_of_sweden=no_of_sweden;
	        this.sweden_cost=sweden_cost;
	     }
	 public float cost()
	  {
	     float c=(float)(no_of_sweden)*(sweden_cost);
	     return c;
	  }
}