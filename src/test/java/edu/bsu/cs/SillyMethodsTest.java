package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SillyMethodsTest {
    @Test
    public void Test97(){
       int testValue = SillyMethods.WackyNumberGenerator(97);
       Assertions.assertEquals(90, testValue);
    }
}
