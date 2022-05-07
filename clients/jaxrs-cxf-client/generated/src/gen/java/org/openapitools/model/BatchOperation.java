package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

