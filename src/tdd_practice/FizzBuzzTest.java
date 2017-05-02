package tdd_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
    FizzBuzz fizz = new FizzBuzz();
    
    @Test
    public void multiples_of_three_should_be_Fizz(){
        assertEquals("12Fizz45Fizz78Fizz1011Fizz1314Fizz1617Fizz1920", fizz.fizzbuzz());
    }
    
}
