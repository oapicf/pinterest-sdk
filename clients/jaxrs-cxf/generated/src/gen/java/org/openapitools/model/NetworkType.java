package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of network connection.
 */
public enum NetworkType {
  
  WIFI("wifi"),
  
  CELLULAR_2G("cellular_2g"),
  
  CELLULAR_3G("cellular_3g"),
  
  CELLULAR_4G("cellular_4g"),
  
  CELLULAR_5G("cellular_5g"),
  
  CELLULAR_6G("cellular_6g"),
  
  ETHERNET("ethernet"),
  
  UNKNOWN("unknown");

  private String value;

  NetworkType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NetworkType fromValue(String value) {
    for (NetworkType b : NetworkType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

