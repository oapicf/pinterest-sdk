package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * The operation performed by the batch
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The operation performed by the batch
 */
public enum BatchOperation {
  
  UPDATE("UPDATE"),
  
  CREATE("CREATE"),
  
  UPSERT("UPSERT");

  private String value;

  BatchOperation(String value) {
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

  public static BatchOperation fromValue(String value) {
    for (BatchOperation b : BatchOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}