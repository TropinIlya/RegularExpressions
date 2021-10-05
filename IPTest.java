package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IPTest {

    @Test
    public void test1() {
        String s = "11.45.23.234";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }
    @Test
    public void test2() {
        String s = "11.45.23.234.45";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
    @Test
    public void test3() {
        String s = "11.45.23";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
    @Test
    public void test4() {
        String s = "11.45.23.256";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
    @Test
    public void test5() {
        String s = "011.45.23.256";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
    @Test
    public void test6() {
        String s = "1y.45.23.256";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
    @Test
    public void test7() {
        String s = "11.45,23.256";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
    @Test
    public void test8() {
        String s = "абракадабра";
        IP test = new IP();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
}