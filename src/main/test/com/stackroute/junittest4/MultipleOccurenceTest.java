package com.stackroute.junittest4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceTest
{
    MultipleOccurence obj;
    @Test
    public void getIndexOfMultipleOccurance() {
        obj=new MultipleOccurence();
        String result=obj.checkMultipleOccurance("She sells seashells by the seashore","se");
        assertEquals("4-6 10-12 27-29 ",result);
    }
    @Test
    public void getIndexOfMultipleOccuranceNotNull() {
        obj=new MultipleOccurence();
        String result=obj.checkMultipleOccurance("She sells seashells by the seashore","se");
        assertNotNull(result);
    }
    @Test
    public void getIndexOfMultipleOccuranceNull() {
        obj=new MultipleOccurence();
        String result=obj.checkMultipleOccurance(null,"se");
        assertNull(result);
    }
    @Test
    public void getIndexOfMultipleOccuranceNoPattern() {
        obj=new MultipleOccurence();
        String result=obj.checkMultipleOccurance("akhgsfkugsahf adsf","pkn");
        assertEquals("",result);
    }


}