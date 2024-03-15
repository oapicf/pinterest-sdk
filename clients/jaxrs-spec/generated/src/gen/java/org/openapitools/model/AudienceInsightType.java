package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AudienceInsightType
 */
public enum AudienceInsightType {
  
  YOUR_TOTAL_AUDIENCE("YOUR_TOTAL_AUDIENCE"),
  
  YOUR_ENGAGED_AUDIENCE("YOUR_ENGAGED_AUDIENCE"),
  
  PINTEREST_TOTAL_AUDIENCE("PINTEREST_TOTAL_AUDIENCE");

  private String value;

  AudienceInsightType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AudienceInsightType fromString(String s) {
      for (AudienceInsightType b : AudienceInsightType.values()) {
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
  public static AudienceInsightType fromValue(String value) {
    for (AudienceInsightType b : AudienceInsightType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


