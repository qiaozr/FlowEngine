package com.allinpay.flow.demo;

import java.util.HashMap;
import java.util.Map;

public class OtherTest
{
    private static final Map<String, String> map = new HashMap<String, String>();

    private static String abc = "abv";

    public static void main(String[] args)
    {
        System.out.println(map.size());
        map.put("1", "1");
        System.out.println(map.size());
        abc = "111";
        System.out.println(abc);
    }

}
