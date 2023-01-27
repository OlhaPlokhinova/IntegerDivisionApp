package com.foxminded.formatter;

import java.util.function.Supplier;

public interface FormatterSupplier extends Supplier<Formatter> {

   String getName();

}
