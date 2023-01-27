package com.foxminded.formatter;

public class ClassicFormatterSupplier implements FormatterSupplier {

   @Override
   public Formatter get() {
      return new ClassicFormatter();
   }

   @Override
   public String getName() {
      return "classic";
   }

}












