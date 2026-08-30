package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecTargetingStrategyItems
 */
public enum TargetingSpecTargetingStrategyItems {
  
  CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
  
  FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
  
  RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

  private String value;

  TargetingSpecTargetingStrategyItems(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecTargetingStrategyItems fromValue(String value) {
    for (TargetingSpecTargetingStrategyItems b : TargetingSpecTargetingStrategyItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

