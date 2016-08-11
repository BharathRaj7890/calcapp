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
		int k=c.add(501, 5456);
	float l=c.div(524,78);
		int a=c.sub(452, 40);
		int m=c.mul(70, 60);
		System.out.println("addition=" +k);
		System.out.println("substraction is="+a);
		System.out.println("multiplication is="+m);
		System.out.println("division is="+l);
		
		
		
	}
	
}
