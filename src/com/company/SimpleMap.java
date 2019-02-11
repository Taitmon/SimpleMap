package com.company;

import java.util.HashMap;

public class SimpleMap
{
    public static void main(String[] args)
    {
        SimpleMap map = new SimpleMap();
        map.demo();
    }

    public void demo()
    {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "United States" );
        countries.put("MEX", "Mexico" );
        countries.put("CAN", "Canada" );

        String countryUSA = countries.get("USA");
        String countryCAN = countries.get("CAN");
        System.out.println(countryUSA);
        System.out.println(countryCAN);

        countries.put("USA", "United States Duex" );
        String countryUSADuex = countries.get("USA");
        System.out.println(countryUSADuex);

        System.out.println(countries);
        countries.remove("USA");
        System.out.println(countries);
    }
}
