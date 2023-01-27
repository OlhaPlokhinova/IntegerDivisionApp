package com.foxminded;

import com.foxminded.model.Result;
import com.foxminded.model.Step;
import java.util.ArrayList;
import java.util.List;

import static com.foxminded.utils.MathUtils.intLength;

public class Calculator {

   public Result divide(int dividend, int divisor) {

      if (divisor == 0) {
         throw new IllegalArgumentException("Count error");
      }

      List<Step> steps = new ArrayList<>();
      int[] digits = toDigits(dividend);
      int minuend = 0;
      int quotient = 0;
      for (int digit : digits) {
         minuend = minuend * 10 + digit;
         int stepQuotient = minuend / divisor;
         int subtrahend = stepQuotient * divisor;
         int difference = minuend - subtrahend;
         quotient = quotient * 10 + stepQuotient;
         steps.add(new Step(minuend, subtrahend, difference, stepQuotient));
         minuend = difference;
      }
      int reminder = minuend;
      return new Result(dividend, divisor, quotient, reminder, steps);
   }

   public int[] toDigits(int dividend) {
      int length = intLength(dividend);
      int[] result = new int[length];
      for (int i = (length - 1); i >= 0; i--) {
         result[i] = dividend % 10;
         dividend /= 10;
      }
      return result;
   }

}
