package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassTest {
    @Test
    public void test1() {
        String s = "C00l_Pass";
        Pass test = new Pass();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test2() {
        String s = "SupperPas1";
        Pass test = new Pass();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test3() {
        String s = "Cool_pass";
        Pass test = new Pass();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test4() {
        String s = "C001";
        Pass test = new Pass();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
}