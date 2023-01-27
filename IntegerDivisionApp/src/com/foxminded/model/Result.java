package com.foxminded.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Result {
   private final int dividend;
   private final int divisor;
   private final int quotient;
   private final int reminder;

   private final List<Step> steps;

   public Result(int divdend, int divisor, int quotient, int reminder, List<Step> steps) {
      this.dividend = divdend;
      this.divisor = divisor;
      this.quotient = quotient;
      this.reminder = reminder;
      this.steps = Collections.unmodifiableList(steps);
   }

   public int getDividend() {
      return dividend;
   }

   public int getDivisor() {
      return divisor;
   }

   public int getQuotient() {
      return quotient;
   }

   public int getReminder() {
      return reminder;
   }

   public List<Step> getSteps() {
      return steps;

   }

   @Override
   public String toString() {
      return "Result [dividend=" + dividend + ", divisor=" + divisor + ", quotient=" + quotient + ", reminder="
            + reminder + ", steps=" + steps + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(dividend, divisor, quotient, reminder, steps);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Result other = (Result) obj;
      return dividend == other.dividend && divisor == other.divisor && quotient == other.quotient
            && reminder == other.reminder && Objects.equals(steps, other.steps);
   }

}
