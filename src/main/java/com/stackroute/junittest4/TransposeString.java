package com.stackroute.junittest4;

import java.sql.ResultSet;

public class TransposeString
{
    public String returnTransposeString(String string)
    {

        String word[] = string.split(" ");
        String reverse = "";
        String Result = "";

        for (String arr : word)
        {
            //reverse loop
            for (int i = arr.length() - 1; i >=0; i--)
            {
                //storing each letter
                reverse = reverse + arr.charAt(i);
            }

            Result = Result.concat(reverse).concat(" ");
            reverse="";
        }
        return Result.trim();
    }
}