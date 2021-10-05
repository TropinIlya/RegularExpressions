package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLTest {

    @Test
    public void test1() {
        String s = "http://www.example.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test2() {
        String s = "http://example.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test3() {
        String s = "Just Text";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test4() {
        String s = "http://a.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test5() {
        String s = "://example.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test6() {
        String s = "http://www.example.com/file";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test7() {
        String s = "http://www.example.com: 80";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test8() {
        String s = "http://www.example.com/";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test9() {
        String s = "http://www.example.com/search/xml?user=xml-search-user&key=03.44583456:c876e1b098gh65khg834ggg1jk4ll9j8&query=%3Ctable%3E&groupby=attr%3Dd.mode%3Ddeep.groups-on-page%3D5.docs-in-group%3D3&maxpassages=3&page=1";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test10() {
        String s = "http://www.-example.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test11() {
        String s = "http://www.exa-mple.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }

    @Test
    public void test12() {
        String s = "http://www.exam_ple.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test13() {
        String s = "http://www.exam ple.com";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(false,res);
    }

    @Test
    public void test14() {
        String s = "http://www.example.com#razdel-3";
        URL test = new URL();
        Boolean res = test.Test(s);
        Assert.assertEquals(true,res);
    }
}