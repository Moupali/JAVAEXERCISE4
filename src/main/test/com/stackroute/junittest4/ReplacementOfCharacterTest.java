package com.stackroute.junittest4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplacementOfCharacterTest {

    ReplacementOfCharacter obj;

    @Before
    public void setUp() throws Exception {

        obj = new ReplacementOfCharacter();
    }

    @After
    public void tearDown() throws Exception {

        obj = null;
    }

    @Test
    public void givenStringWillReplaceAndReturn1() {

        ReplacementOfCharacter obj = new ReplacementOfCharacter();
        //Act
        String result = obj.findOccurence("daily dry");
        //Assert
        assertEquals("faity fry",result);
    }

    @Test
    public void givenStringWillReplaceAndReturn2() {
        //arrange
        ReplacementOfCharacter obj = new ReplacementOfCharacter();
        //Act
        String result = obj.findOccurence("doodle");
        //Assert
        assertEquals("foofte",result);
    }
}
