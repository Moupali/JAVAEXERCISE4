package com.stackroute.junittest4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString obj;

    @Before
    public void setUp() throws Exception {

        obj = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {

        obj = null;
    }

    @Test
    public void givenStringWillReturnTransposeString1() {

        TransposeString obj = new TransposeString();
        //Act
        String result = obj.returnTransposeString("Java program");
        //Assert
        assertEquals("avaJ margorp",result);
    }

    @Test
    public void givenStringWillReturnTransposeString2() {
        //arrange
        TransposeString obj = new TransposeString();
        //Act
        String result = obj.returnTransposeString("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
}
