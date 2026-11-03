package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * oCPM learn mode.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-03T06:16:03.582968295Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public enum ConversionLearningModeType {
  
  NOT_ACTIVE("NOT_ACTIVE"),
  
  ACTIVE("ACTIVE");

  private String value;

  ConversionLearningModeType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConversionLearningModeType fromString(String s) {
      for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
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
  public static ConversionLearningModeType fromValue(String value) {
    for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


