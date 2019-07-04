package com.stackroute.junittest4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OccurenceOfCharacterTest {

    OccurenceOfCharacter obj;

    @Before
    public void setUp() throws Exception {

        obj = new OccurenceOfCharacter();
    }

    @After
    public void tearDown() throws Exception {

        obj = null;
    }

    @Test
    public void givenStringWillReturnLengthWithoutCharacter1() {
        OccurenceOfCharacter obj = new OccurenceOfCharacter();
        //Act
        int result = obj.findOccurence("Java is java again java again", "a");
        //Assert
        assertEquals(10, result);
    }

    @Test
    public void givenStringWillReturnLengthWithoutCharacter2() {
        //arrange
        OccurenceOfCharacter obj = new OccurenceOfCharacter();
        //Act
        int result = obj.findOccurence("Welcome to Stackroute", "e");
        //Assert
        assertEquals(3,result);
    }
    @Test
    public void givenStringWillReturnZeroLength() {
        //arrange
        OccurenceOfCharacter obj = new OccurenceOfCharacter();
        //Act
        int result = obj.findOccurence("Welcome to Stackroute", "i");
        //Assert
        assertEquals(0,result);
    }

}