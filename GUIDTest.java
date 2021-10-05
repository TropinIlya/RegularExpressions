package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GUIDTest {

    @Test
    public void test1() {
        String s = "e02fd0e4-00fd-090A-ca30-0d00a0038ba0";
        GUID test = new GUID();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test2() {
        String s = "e02fd0e400fd090Aca300d00a0038ba0";
        GUID test = new GUID();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test3() {
        String s = "e02fd0e4_00fd-090A-ca30-0d00a0038ba0";
        GUID test = new GUID();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test4() {
        String s = "e2fd0e4-00fd-090A-ca30-0d00a0038ba0";
        GUID test = new GUID();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }
}