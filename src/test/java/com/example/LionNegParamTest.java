package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionNegParamTest {
    private static final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самец или самка";
    private final String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Кит"},
                {"Cat"},
                {"123"},
        };
    }
    public LionNegParamTest(String sex) {
        this.sex = sex;
        }

    @Test
    public void doesHaveMane(){
        Exception exception = assertThrows(Exception.class, () -> new Lion(sex, null));
        Assert.assertEquals(EXPECTED_ERROR, exception.getMessage());
    }

}