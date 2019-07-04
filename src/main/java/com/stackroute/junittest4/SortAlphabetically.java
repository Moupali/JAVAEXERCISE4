package com.stackroute.junittest4;

import java.util.Arrays;

public class SortAlphabetically
{
    public String sorting(String string)
    {
        String result = "";
        //split and store in an array
        String word[] = string.split(" ");

        //sorting using Arrays.sort()
        Arrays.sort(word,string.CASE_INSENSITIVE_ORDER);

        for (String arr : word) {
            result = result.concat(arr).concat(" ");
        }
        //return the result after removing last space
        return result.trim();
    }
}