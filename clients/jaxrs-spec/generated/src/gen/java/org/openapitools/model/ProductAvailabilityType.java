package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Default availability for products in a feed.
 */
public enum ProductAvailabilityType {
  
  IN_STOCK("IN_STOCK"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  PREORDER("PREORDER"),
  
  NULL("null");

  private String value;

  ProductAvailabilityType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ProductAvailabilityType fromString(String s) {
      for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      return null;
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductAvailabilityType fromValue(String value) {
    for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


