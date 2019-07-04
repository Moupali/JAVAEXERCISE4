package com.stackroute.junittest4;
import java.util.regex.Pattern;

public class ExpressionChecker {

    public String searchRegularExpresison(String inputString)
    {
       String[] arrString=inputString.split(" ");
        for(int i=0;i<arrString.length;i++)
    {
        //Checking for the occurance of Harry using regular Expresion
        if(Pattern.matches("Har+y?",
                arrString[i])){
            return "Contains Harry";
        }
        //Checking occurance for henry using regular expression
        if(Pattern.matches("Henry?",arrString[i]))
        {
            return "Contains Henry";
        }

    }
    //If neither of them are found in the string then not found message is printed
        return "Doesn't contains Harry and Henry both";
}
}
