package com.foxminded.formatter;

import static com.foxminded.utils.MathUtils.intLength;
import static com.foxminded.utils.StringUtils.dashLine;
import static com.foxminded.utils.StringUtils.spacer;
import com.foxminded.model.Result;
import com.foxminded.model.Step;

public class GermanFormatter implements Formatter {

   @Override
   public String format(Result result) {
      StringBuilder sb = new StringBuilder();
      boolean firstStepRendered = false;
      int offset = 0;
      for (Step step : result.getSteps()) {

         if (!firstStepRendered) {
            if (step.getSubtrahend() != 0) {
               offset = renderFirstPart(sb, result, step);
               firstStepRendered = true;
            }
         } else {
            if (step.getSubtrahend() == 0) {
               offset++;
            } else {
               offset = renderRegularPart(sb, step, offset);
            }
         }
      }
      sb.append(String.format("%s%d", spacer(offset + 1), result.getReminder()));
      return sb.toString();
   }

   private int renderFirstPart(StringBuilder sb, Result result, Step step) {
      int dividendLength = intLength(result.getDividend());
      int subtrahendLength = intLength(step.getSubtrahend());

      int spacerLength = dividendLength - subtrahendLength;
      String spacer = spacer(spacerLength);

      int dashLineLength = Math.max(intLength(result.getDivisor()), intLength(result.getQuotient()));
      String dashLine = dashLine(dashLineLength);

      String dashLine2 = dashLine(subtrahendLength);
      String spacer2 = spacer(dividendLength - subtrahendLength);

      sb.append(String.format("_%d ÷ %d => %d\n", result.getDividend(), result.getDivisor(), result.getQuotient()));
      sb.append(String.format(" %d%s\n", step.getSubtrahend(), spacer, dashLine));
      sb.append(String.format(" %s%s\n", dashLine2, spacer2));

      return subtrahendLength - 1;
   }

   private int renderRegularPart(StringBuilder sb, Step step, int offset) {
      String spacer = spacer(offset);
      sb.append(String.format("%s_%d\n", spacer, step.getMinuend()));
      sb.append(String.format("%s %d\n", spacer, step.getSubtrahend()));
      int subtrahendLength = intLength(step.getSubtrahend());
      sb.append(String.format("%s %s\n", spacer, dashLine(subtrahendLength)));
      return offset + subtrahendLength - 1;
   }

}



















