package com.mvp.studio.ex1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DogTest {

    @InjectMocks
    Dog dog;

    @Test
    public void givenTimeLessThen4hours_whenNeedsToGo_thenShouldReturnFalse(){
       //TODO implement test
    }

    @Test
    public void givenTimeMoreThen4hours_whenNeedsToGo_thenShouldReturnTrue(){
        //TODO implement test
    }

    @Test
    public void givenTimeEqualsTo4hours_whenNeedsToGo_thenShouldReturnFalse(){
        //TODO implement test
    }

}