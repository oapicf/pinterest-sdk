package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Entity status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntityStatus fromValue(String text) {
    for (EntityStatus b : EntityStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


