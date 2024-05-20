package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    public Lion lion;
    @Mock
    public Feline feline;

    @Test
    public void testLionFood() throws Exception {
        lion = new Lion("Самец", feline);
        String predator = "Хищник";
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood(predator)).thenReturn(expected);
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testLionKittensCount() throws Exception {
        lion = new Lion("Самец", feline);
        int actual = feline.getKittens();
        int expected = lion.getKittens();

        assertEquals(expected, actual);
    }
}