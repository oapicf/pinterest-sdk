package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ProductCategoriesEngagementType
 */
public enum ProductCategoriesEngagementType {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  SAVE("SAVE");

  private String value;

  ProductCategoriesEngagementType(String value) {
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

  public static ProductCategoriesEngagementType fromValue(String value) {
    for (ProductCategoriesEngagementType b : ProductCategoriesEngagementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}