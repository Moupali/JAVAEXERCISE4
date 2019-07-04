/*1. Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string*/

package com.stackroute.junittest4;

public class OccurenceOfCharacter
{

    public int findOccurence(String string, String character)
    {
        //it will find the no of times the character occured
        int charcount = string.length() - (string.replaceAll(character, "").length());


        return charcount;
    }
}