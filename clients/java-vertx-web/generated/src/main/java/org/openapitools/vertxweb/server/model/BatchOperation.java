package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
 */
public enum BatchOperation {
  
  UPDATE("UPDATE"),
  
  UPSERT("UPSERT"),
  
  CREATE("CREATE"),
  
  DELETE_DISCONTINUED("DELETE_DISCONTINUED"),
  
  DELETE("DELETE");

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