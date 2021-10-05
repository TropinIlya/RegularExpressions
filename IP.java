package com.company;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class IP {

    public static boolean Test(String s)
    {
        return(matches("^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$", s));
    }


}
