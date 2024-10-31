package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {

    @Test
    @DisplayName("Test si el número es divisible por 3")
    public void test_whenTheNumberIsDivisibleByThree_thenReturnFizz(){
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber(9);
        //Then
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 5")
    public void test_whenTheNumberIsDivisibleByFive_thenReturnFizz(){
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber(10);
        //Then
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 3 y 5")
    public void test_whenTheNumberIsDivisibleByThreeAndFive_thenReturnFizz() {
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber(115);
        //Then
        assertEquals("Fizz", result);
    }
        @Test
        @DisplayName("Test si el número no es divisible mi por 3 ni por 5")
        public void test_whenTheNumberIsNotDivisibleByThreeOrFive_thenReturnFizz(){
            //Given
            Fizzbuzz fizzbuzz = new Fizzbuzz();
            //When
            String result = fizzbuzz.checkNumber(12);
            //Then
            assertEquals("Fizz",result);

}
}
