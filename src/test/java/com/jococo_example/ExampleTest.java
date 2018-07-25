package com.jococo_example;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void displayTest0() {
		Assert.assertEquals("Test...", Example.display(0));
	}

	@Test
	public void displayTest1() {
		Assert.assertEquals(".....", Example.display(1));
	}
}
