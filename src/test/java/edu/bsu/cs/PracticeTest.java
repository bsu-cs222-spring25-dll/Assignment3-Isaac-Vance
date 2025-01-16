package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PracticeTest {
    @Test
    public void Test97(){
       int testValue = Practice.WackyNumberGenerator(97);
       Assertions.assertEquals(90, testValue);
    }
}
