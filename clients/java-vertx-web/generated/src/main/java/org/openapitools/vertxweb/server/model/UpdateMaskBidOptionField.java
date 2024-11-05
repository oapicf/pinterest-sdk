package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * bid option field to apply operation updates to
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * bid option field to apply operation updates to
 */
public enum UpdateMaskBidOptionField {
  
  BID("BID"),
  
  APP_TYPE_BID_MULTIPLIER_SET("APP_TYPE_BID_MULTIPLIER_SET"),
  
  PLACEMENT_BID_MULTIPLIER_SET("PLACEMENT_BID_MULTIPLIER_SET");

  private String value;

  UpdateMaskBidOptionField(String value) {
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

  public static UpdateMaskBidOptionField fromValue(String value) {
    for (UpdateMaskBidOptionField b : UpdateMaskBidOptionField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}