package com.test;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.calc.Calc;

public class CalcTest
{
	Calc c=null;
	@BeforeClass
	public void setup()
	{
		c=new Calc(); 
	}
	
	@Test
	public void add()
	{
		int x=23;
		int y=23;
		int r=c.add(x, y);
		int expt=46;
		Assert.assertEquals(expt, r);
	}

}
