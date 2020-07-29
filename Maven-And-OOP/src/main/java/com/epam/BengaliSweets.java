package com.epam;

public class BengaliSweets extends Sweets {
	private float bengali_weight;
	   private float bengali_cost;
	   BengaliSweets(String name_of_sweet,float bengali_weight,float bengali_cost)
	      {
	           super(name_of_sweet);
	           this.bengali_weight=bengali_weight;
	           this.bengali_cost=bengali_cost;
	      }
	 public float cost()
	     {
	         float c = (float)(bengali_weight*bengali_cost);
	         return c;
	     }
}
