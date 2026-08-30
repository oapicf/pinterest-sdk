package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Collections ad header type for ads
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Collections ad header type for ads
 */
public enum AdCollectionsHeaderType {
  
  SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
  
  EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
  
  NO_HEADER("NO_HEADER");

  private String value;

  AdCollectionsHeaderType(String value) {
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

  public static AdCollectionsHeaderType fromValue(String value) {
    for (AdCollectionsHeaderType b : AdCollectionsHeaderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}