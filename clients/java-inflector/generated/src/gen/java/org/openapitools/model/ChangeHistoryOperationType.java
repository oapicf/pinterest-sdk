package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ChangeHistoryOperationType
 */
public enum ChangeHistoryOperationType {
  
  CREATE("CREATE"),
  
  UPDATE("UPDATE"),
  
  DELETE("DELETE");

  private String value;

  ChangeHistoryOperationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChangeHistoryOperationType fromValue(String text) {
    for (ChangeHistoryOperationType b : ChangeHistoryOperationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


