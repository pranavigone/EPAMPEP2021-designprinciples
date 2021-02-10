package com.epam.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalciTest {

  Calci cal = new Calci();
    
    public void testAdd() {
        Assert.assertEquals(cal.addition(10, 20), 30);
    }
    public void testMultiply() {
        Assert.assertEquals(cal.multiplication(10, 20), 200);
    }

}
