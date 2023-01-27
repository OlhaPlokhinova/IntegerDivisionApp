package com.foxminded.model;

import java.util.Objects;

public class Step {
   private int minuend;
   private int subtrahend;
   private int difference;
   private int stepQuotient;

   public Step(int minuend, int subtrahend, int difference, int stepQuotient) {
      this.minuend = minuend;
      this.subtrahend = subtrahend;
      this.difference = difference;
      this.stepQuotient = stepQuotient;
   }

   public int getMinuend() {
      return minuend;
   }

   public int getSubtrahend() {
      return subtrahend;
   }

   public int getDifference() {
      return difference;
   }

   public int getStepQuotient() {
      return stepQuotient;
   }

   @Override
   public int hashCode() {
      return Objects.hash(difference, minuend, stepQuotient, subtrahend);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Step other = (Step) obj;
      return difference == other.difference && minuend == other.minuend && stepQuotient == other.stepQuotient
            && subtrahend == other.subtrahend;
   }

   @Override
   public String toString() {
      return "Step [minuend=" + minuend + ", subtrahend=" + subtrahend + ", difference=" + difference
            + ", stepQuotient=" + stepQuotient + ", hashCode()=" + hashCode() + "]";
   }
}
