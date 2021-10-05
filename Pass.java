package com.company;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class Pass {
    public static boolean Test(String s)
    {
        return(matches("^(\\w*[A-Z]\\w*[a-z]\\w*[0-9]\\w*)|(\\w*[a-z]\\w*[A-Z]\\w*[0-9]\\w*)|(\\w*[0-9]\\w*[A-Z]\\w*[a-z]\\w*)|(\\w*[0-9]\\w*[a-z]\\w*[A-Z]\\w*)|(\\w*[a-z]\\w*[0-9]\\w*[A-Z]\\w*)|(\\w*[A-Z]\\w*[0-9]\\w*[a-z]\\w*)$", s));
    }

    //(Если сохранить условие на 8 символов то регулярное выражение будет в 336/6 = 56 раз длиннее)
}
