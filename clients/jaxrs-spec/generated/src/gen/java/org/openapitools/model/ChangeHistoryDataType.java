package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ChangeHistoryDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum ChangeHistoryDataType {
  
  STRING("STRING"),
  
  NUMERIC("NUMERIC"),
  
  MICROCURRENCY("MICROCURRENCY"),
  
  DATE("DATE"),
  
  BOOL("BOOL"),
  
  GENDER_LIST("GENDER_LIST"),
  
  AGE_BUCKET_LIST("AGE_BUCKET_LIST"),
  
  APPTYPE_LIST("APPTYPE_LIST"),
  
  COUNTRY_LIST("COUNTRY_LIST"),
  
  LOCALE_LIST("LOCALE_LIST");

  private String value;

  ChangeHistoryDataType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ChangeHistoryDataType fromString(String s) {
      for (ChangeHistoryDataType b : ChangeHistoryDataType.values()) {
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
  public static ChangeHistoryDataType fromValue(String value) {
    for (ChangeHistoryDataType b : ChangeHistoryDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


