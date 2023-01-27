package com.foxminded.formatter;

public class GermanFormatterSupplier implements FormatterSupplier {

   @Override
   public Formatter get() {
      return new GermanFormatter();
   }

   @Override
   public String getName() {
      return "german";
   }

}












