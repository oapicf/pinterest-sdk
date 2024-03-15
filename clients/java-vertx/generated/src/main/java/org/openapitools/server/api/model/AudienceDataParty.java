package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceDataParty fromValue(String value) {
    for (AudienceDataParty b : AudienceDataParty.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}