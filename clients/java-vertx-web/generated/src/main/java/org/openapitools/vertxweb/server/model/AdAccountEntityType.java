package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Specify the entity type to get summary information
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specify the entity type to get summary information
 */
public enum AdAccountEntityType {
  
  ADVERTISER("ADVERTISER"),
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP"),
  
  AD("AD");

  private String value;

  AdAccountEntityType(String value) {
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

  public static AdAccountEntityType fromValue(String value) {
    for (AdAccountEntityType b : AdAccountEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}