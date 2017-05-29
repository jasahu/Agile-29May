package com.capgemini;

public class Maths {
	
	int i,fact=1;  
	public int getFact(int num)
	{
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		
		if(num==0)
		{
			return 1;
		}
		if(num>0)
		{
			for(i=1;i<=num;i++){    
			      fact=fact*i;
			    
			  }  
			  return fact;
		}
		
		return 1;
	}

}
