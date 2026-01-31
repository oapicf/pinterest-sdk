package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecAgeBucket
 */
public enum TargetingSpecAgeBucket {
  
  _18_24("18-24"),
  
  _19_("19+"),
  
  _20_("20+"),
  
  _21_("21+"),
  
  _25_34("25-34"),
  
  _35_44("35-44"),
  
  _45_49("45-49"),
  
  _50_54("50-54"),
  
  _55_64("55-64"),
  
  _65_("65+");

  private String value;

  TargetingSpecAgeBucket(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TargetingSpecAgeBucket fromString(String s) {
      for (TargetingSpecAgeBucket b : TargetingSpecAgeBucket.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecAgeBucket fromValue(String value) {
    for (TargetingSpecAgeBucket b : TargetingSpecAgeBucket.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


