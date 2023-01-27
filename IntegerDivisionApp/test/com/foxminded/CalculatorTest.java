package com.foxminded;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import com.foxminded.model.Result;
import com.foxminded.model.Step;

class CalculatorTest {

   @Test
   void divideMethod_ShouldCreatDivisionSteps() {

      Calculator calc = new Calculator();

      Result expected = new Result(38434, 5, 7686, 4, Arrays.asList(
            new Step(3, 0, 3, 0), 
            new Step(38, 35, 3, 7),
            new Step(34, 30, 4, 6), 
            new Step(43, 40, 3, 8), 
            new Step(34, 30, 4, 6)));

      Result actual = calc.divide(38434, 5);
      assertEquals(expected, actual);
   }
   
}
