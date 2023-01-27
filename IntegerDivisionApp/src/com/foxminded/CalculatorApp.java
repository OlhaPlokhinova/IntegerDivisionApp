package com.foxminded;

import com.foxminded.formatter.Formatter;
import com.foxminded.formatter.FormatterFactory;
import com.foxminded.model.Result;

public class CalculatorApp {

   public static void main(String[] args) {

      Calculator calc = new Calculator();
      Result result = calc.divide(251234, 202);
      Formatter formatter = FormatterFactory.getInstance().get("german");
      String output = formatter.format(result);

      System.out.println(output);
   }
   
}










