package com.epam;

import java.util.*;
public class NewYearGift 
	    {
	      public static void main(String args[])
	         {
	    	     AddItems a=new AddItems();
	    	     float choc_cost,sweet_cost;
	             float sweet_weight;
	             int no_of_chocolates;
	             int ch,op;
	             Scanner s=new Scanner(System.in);
	             boolean loop=true;
	             while(loop)
	             {
	                 System.out.println("Menu\n");
	                 System.out.println("1.Sweets\n");
	                 System.out.println("2.chocolates\n");
	                 System.out.println("3.exit\n");
	                 System.out.println("Select your item\n");
	                 ch=s.nextInt();
	                 switch(ch)
	                 {
	                     case 1:System.out.println("1.BengaliSweets\n");
	                            System.out.println("2.AndhraSweets\n");
	                            System.out.println("Select your favourite sweet\n");
	                            op=s.nextInt();
	                            switch(op)
	                               {
	                                  
	                                  case 1:System.out.println("Enter no of the Bengali sweets\n");
	                                         sweet_weight=s.nextFloat();
	                                         BengaliSweets bengali=new BengaliSweets("BengaliSweets",sweet_weight,20);
	                                         sweet_cost=bengali.cost();
	                                         a.addSweets(sweet_cost,"BengaliSweets");
	                                         break;
	                                  case 2:System.out.println("Enter no of the Andhra sweets\n");
	                                         sweet_weight=s.nextFloat();
	                                         AndhraSweets andhra=new AndhraSweets("AndhraSweets",sweet_weight,15);
	                                         sweet_cost=andhra.cost();
	                                         a.addSweets(sweet_cost,"AndhraSweets");
	                                         break;    
	                               }
	                            break;
	                     case 2:System.out.println("1.BelgianChocolates\n");
	                            System.out.println("2.SwedenChocolates\n");
	                            System.out.println("Select your favourite chocolate\n");
	                            op=s.nextInt();
	                            switch(op)
	                               {
	                                  case 1:System.out.println("Enter no of Belgian chocolates you want\n");
	                                         no_of_chocolates=s.nextInt();
	                                         BelgianChocolates belgian=new BelgianChocolates("BelgianChocolates",no_of_chocolates,40);
	                                         choc_cost=belgian.cost();
	                                         a.addChocolates(choc_cost);
	                                         break;
	                                  case 2:System.out.println("Enter no of Sweden chocolates you want\n");
	                                         no_of_chocolates=s.nextInt();
	                                         SwedenChocolates sweden=new SwedenChocolates("SwedenChocoloates",no_of_chocolates,10);
	                                         choc_cost=sweden.cost();
	                                         a.addChocolates(choc_cost);
	                                         break;
	                               }
	                            break;
	                     case 3:loop=false;
	                    	    break;
	                    }
	               }
	               a.display();
	               s.close();
	          }
	  }