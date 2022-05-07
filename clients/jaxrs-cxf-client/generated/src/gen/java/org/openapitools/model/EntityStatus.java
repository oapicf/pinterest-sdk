package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Entity status
 */
public enum EntityStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  EntityStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityStatus fromValue(String value) {
    for (EntityStatus b : EntityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

