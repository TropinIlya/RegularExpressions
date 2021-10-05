package com.company;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class URL {

    public static boolean Test(String s)
    {
        {
            return (matches("^(https?)?:\\/\\/((\\w+\\.)?[0-9a-z][0-9a-z-]*[0-9a-z]\\.\\w+)(: [1-9]\\d?)?(\\/(?!.*search)\\w+)*(\\/search\\/xml\\?.+(\\&.+)*)?(\\#.+)?$", s));
        }
    }

}
