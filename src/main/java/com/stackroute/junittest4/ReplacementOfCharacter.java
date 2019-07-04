package com.stackroute.junittest4;

public class ReplacementOfCharacter
{
    public String findOccurence(String string)
    {
        String result="";
        //replace d with f
         result=string.replaceAll("d", "f");
         //replace l with t
        result=result.replaceAll("l", "t");


        return result;
    }
}

