package com.jococo_example;

import org.junit.Assert;
import org.junit.Test;

public class SampleClassTest {

	@Test
	public void showTest0() {
		Assert.assertEquals(SampleClass.show(0),"Test...");
	}

	@Test
	public void showTest1() {
		Assert.assertEquals(SampleClass.show(1),".....");
	}
}
