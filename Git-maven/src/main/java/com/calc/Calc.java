package com.calc;

public class Calc
{
	public int add(int x,int y)
	{
		int result=x+y;
		return result;
	}

	public int mul(int x,int y)
	{
		int r=x*y;
		return r;
	}
	
	public int sub(int x,int y)
	{
		int r=x-y;
		return r;
	}
	
	
	public float div(int x,int y)
	{
		float r=x/y;
		return r;
	}
	
	public static void main(String[] args) {
		Calc c=new Calc();
		c.add(501, 5456);
		c.div(524,78);
		c.sub(452, 40);
		c.mul(70, 60);
	}
	
}
