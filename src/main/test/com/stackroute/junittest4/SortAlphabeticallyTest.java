package com.stackroute.junittest4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortAlphabeticallyTest {

    SortAlphabetically obj;

    @Before
    public void setUp() throws Exception {

        obj = new SortAlphabetically();
    }

    @After
    public void tearDown() throws Exception {

        obj = null;
    }

    @Test
    public void givenStringWillReturnSortedString1() {

        SortAlphabetically obj = new SortAlphabetically();
        //Act
        String result = obj.sorting("Java program to sort a string");
        //Assert
        assertEquals("a Java program sort string to",result);
    }

    @Test
    public void givenStringWillReturnSortedString2() {
        //arrange
        SortAlphabetically obj = new SortAlphabetically();
        //Act
        String result = obj.sorting("Sudip Kumar Rana");
        //Assert
        assertEquals("Kumar Rana Sudip",result);
    }
}
