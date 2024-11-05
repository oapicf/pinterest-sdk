package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  public static AdvancedAuctionOperation fromValue(String value) {
    for (AdvancedAuctionOperation b : AdvancedAuctionOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

