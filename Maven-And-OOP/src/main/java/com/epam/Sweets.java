package com.epam;

public abstract class Sweets 
{
   protected String name_of_sweet;
   Sweets(String name_of_sweet)
   {
      this.name_of_sweet=name_of_sweet;
   }
   public String getName()
   { 
      return name_of_sweet;
   }
  public abstract float cost();
}