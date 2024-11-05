package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Specifies if the partner is internal or external.
 */
public enum BusinessRoleCheckMode {
  
  INTERNAL("INTERNAL"),
  
  EXTERNAL("EXTERNAL");

  private String value;

  BusinessRoleCheckMode(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessRoleCheckMode fromValue(String value) {
    for (BusinessRoleCheckMode b : BusinessRoleCheckMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

