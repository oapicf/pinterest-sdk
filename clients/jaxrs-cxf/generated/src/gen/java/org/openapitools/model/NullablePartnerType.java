package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets NullablePartnerType
 */
public enum NullablePartnerType {
  
  INTERNAL("INTERNAL"),
  
  EXTERNAL("EXTERNAL");

  private String value;

  NullablePartnerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullablePartnerType fromValue(String value) {
    for (NullablePartnerType b : NullablePartnerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

