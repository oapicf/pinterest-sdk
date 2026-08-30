package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Specify the entity type to get summary information
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specify the entity type to get summary information
 */
public enum AdAccountEntityType {
  
  ADVERTISER("ADVERTISER"),
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP"),
  
  AD("AD");

  private String value;

  AdAccountEntityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdAccountEntityType fromValue(String text) {
    for (AdAccountEntityType b : AdAccountEntityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


