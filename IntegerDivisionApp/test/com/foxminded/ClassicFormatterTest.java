package com.foxminded;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import com.foxminded.formatter.Formatter;
import com.foxminded.formatter.FormatterFactory;
import com.foxminded.model.Result;
import com.foxminded.model.Step;

class ClassicFormatterTest {

@Test
void СlassicFormat_shouldCreatFormatt_ifDivisiorIsOneDigit(){

   Result result = new Result(38434, 5, 7686, 4, Arrays.asList(
         new Step(3, 0, 3, 0), 
         new Step(38, 35, 3, 7),
         new Step(34, 30, 4, 6), 
         new Step(43, 40, 3, 8), 
         new Step(34, 30, 4, 6)
 ));
   
 Formatter classicFormatter = FormatterFactory.getInstance().get("classic");
 String expected = 
         "_38434|5\n" +
         " 35   |----\n" +
         " --   |7686\n" +
         " _34\n" +
         "  30\n" +
         "  --\n" +
         "  _43\n" +
         "   40\n" +
         "   --\n" +
         "   _34\n" +
         "    30\n" +
         "    --\n" +
         "     4";
 
 assertEquals(expected, classicFormatter.format(result));
}

@Test
void СlassicFormat_shouldCreatFormatt_ifDivisiorIsTwoDigits() {
   
   Result result = new Result(21234, 20, 1061, 14, Arrays.asList(
         new Step(21, 20, 1, 10),
         new Step(123, 120, 3, 6), 
         new Step(34, 20, 14, 1)
 ));

   Formatter classicFormatter = FormatterFactory.getInstance().get("classic");
   String expected =
         "_21234|20\n" +
         " 20   |----\n" +
         " --   |1061\n" +
         " _123\n" +
         "  120\n" +
         "  ---\n" +
         "   _34\n" +
         "    20\n" +
         "    --\n" +
         "     14";
   
   assertEquals(expected, classicFormatter.format(result));
}

@Test
void СlassicFormat_shouldCreatFormatt_ifDivisiorIsThreeDigits() {
   
   Result result = new Result(251234, 202, 1243, 148, Arrays.asList(
         new Step(251, 202, 49, 1),
         new Step(492, 404, 89, 2), 
         new Step(883, 808, 75, 4),
         new Step(754, 606, 148, 3)
 ));

   Formatter classicFormatter = FormatterFactory.getInstance().get("classic");
   String expected =
               "_251234|202\n" +
               " 202   |----\n" +
               " ---   |1243\n" +
               "  _492\n" +
               "   404\n" +
               "   ---\n" +
               "    _883\n" +
               "     808\n" +
               "     ---\n" +
               "      _754\n" +
               "       606\n" +
               "       ---\n" +
               "         148";
   
   assertEquals(expected, classicFormatter.format(result));
   }

}


