package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */
public enum OperationType {
  
  SHARE("SHARE"),
  
  REVOKE("REVOKE");

  private String value;

  OperationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationType fromValue(String value) {
    for (OperationType b : OperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

