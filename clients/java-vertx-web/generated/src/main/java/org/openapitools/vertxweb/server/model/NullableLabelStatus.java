package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The new status you want to give the label, either &#x60;ACTIVE&#x60; (in use) or no longer in use (&#x60;ARCHIVED&#x60;).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The new status you want to give the label, either &#x60;ACTIVE&#x60; (in use) or no longer in use (&#x60;ARCHIVED&#x60;).
 */
public enum NullableLabelStatus {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  NullableLabelStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NullableLabelStatus fromValue(String value) {
    for (NullableLabelStatus b : NullableLabelStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}