package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * bid option field to apply operation updates to
 */
public enum UpdateMaskBidOptionField {
  
  BID("BID"),
  
  APP_TYPE_BID_MULTIPLIER_SET("APP_TYPE_BID_MULTIPLIER_SET"),
  
  PLACEMENT_BID_MULTIPLIER_SET("PLACEMENT_BID_MULTIPLIER_SET");

  private String value;

  UpdateMaskBidOptionField(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static UpdateMaskBidOptionField fromString(String s) {
      for (UpdateMaskBidOptionField b : UpdateMaskBidOptionField.values()) {
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
  public static UpdateMaskBidOptionField fromValue(String value) {
    for (UpdateMaskBidOptionField b : UpdateMaskBidOptionField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


