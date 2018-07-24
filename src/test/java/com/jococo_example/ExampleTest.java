package com.jococo_example;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void displayTest0(){
        String s = Example.display(0);
        Assert.assertEquals(s,"Test...");
    }
    
    @Test
    public void displayTest1(){
        String s = Example.display(1);
        Assert.assertEquals(s,".....");
    }
}
