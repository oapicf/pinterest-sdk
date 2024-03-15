package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CatalogsFeedProcessingStatus
 */
public enum CatalogsFeedProcessingStatus {
  
  COMPLETED("COMPLETED"),
  
  COMPLETED_EARLY("COMPLETED_EARLY"),
  
  DISAPPROVED("DISAPPROVED"),
  
  FAILED("FAILED"),
  
  PROCESSING("PROCESSING"),
  
  QUEUED_FOR_PROCESSING("QUEUED_FOR_PROCESSING"),
  
  UNDER_APPEAL("UNDER_APPEAL"),
  
  UNDER_REVIEW("UNDER_REVIEW");

  private String value;

  CatalogsFeedProcessingStatus(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CatalogsFeedProcessingStatus fromString(String s) {
      for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
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
  public static CatalogsFeedProcessingStatus fromValue(String value) {
    for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


