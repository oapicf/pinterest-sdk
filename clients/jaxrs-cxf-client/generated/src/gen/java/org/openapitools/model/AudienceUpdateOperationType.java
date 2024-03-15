package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Audience operation type (update or remove).
 */
public enum AudienceUpdateOperationType {
  
  UPDATE("UPDATE"),
  
  REMOVE("REMOVE");

  private String value;

  AudienceUpdateOperationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceUpdateOperationType fromValue(String value) {
    for (AudienceUpdateOperationType b : AudienceUpdateOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

