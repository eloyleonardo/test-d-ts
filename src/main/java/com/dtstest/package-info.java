//https://github.com/bsorrentino/java2typescript



@Java2TS(declare = {

  @Type(value = java.nio.file.Files.class, export=true),
  @Type(value = java.nio.file.Path.class),
  @Type(value = java.nio.file.Paths.class, export=true),

  @Type(value = java.util.stream.Stream.class,export=true),

  @Type(value = java.util.Collection.class),
  @Type(value = java.util.Map.class),
  @Type(value = java.util.List.class, alias="List" ),
  @Type(value = java.util.Set.class),
  @Type(value = java.util.Arrays.class, export=true),

  @Type(value = java.util.Optional.class),

  @Type(value = java.net.URI.class, export=true),
  @Type(value = java.net.URL.class),

  @Type(value = java.lang.Runnable.class, functional=true),
  
  // this line causes class not found exception
  @Type(value = com.dtstest.service.CustomerService.class)

})
package com.dtstest;

import org.bsc.processor.annotation.Java2TS;
import org.bsc.processor.annotation.Type;
