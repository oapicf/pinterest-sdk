package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 */
public enum AudienceDataParty {
  
  _1P("1p"),
  
  _3P("3p");

  private String value;

  AudienceDataParty(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceDataParty fromValue(String value) {
    for (AudienceDataParty b : AudienceDataParty.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

