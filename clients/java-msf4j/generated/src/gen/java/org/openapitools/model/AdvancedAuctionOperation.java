package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AdvancedAuctionOperation
 */
public enum AdvancedAuctionOperation {
  
  UPSERT("UPSERT"),
  
  DELETE("DELETE");

  private String value;

  AdvancedAuctionOperation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdvancedAuctionOperation fromValue(String text) {
    for (AdvancedAuctionOperation b : AdvancedAuctionOperation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

