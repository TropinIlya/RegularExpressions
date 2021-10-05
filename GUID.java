package com.company;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class GUID {

    public static boolean Test(String s)
    {
        return(matches("^[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}$", s));
    }

}
