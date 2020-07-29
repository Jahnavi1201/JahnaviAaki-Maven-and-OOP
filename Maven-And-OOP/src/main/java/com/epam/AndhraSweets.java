package com.epam;

public class AndhraSweets extends Sweets{
	private float andhra_weight;
	private float andhra_cost;
	AndhraSweets(String name_of_sweet,float andhra_weight,float andhra_cost)
	    {
	           super(name_of_sweet);
	           this.andhra_weight=andhra_weight;
	           this.andhra_cost=andhra_cost;
	    }
	public float cost()
	     {
	         float c = (float)(andhra_weight*andhra_cost);
	         return c;
	     }
}