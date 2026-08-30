package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 */
public enum CustomerListStatus {
  
  PROCESSING("PROCESSING"),
  
  READY("READY"),
  
  TOO_SMALL("TOO_SMALL"),
  
  UPLOADING("UPLOADING");

  private String value;

  CustomerListStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CustomerListStatus fromValue(String value) {
    for (CustomerListStatus b : CustomerListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

