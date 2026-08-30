package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The type of an SSIO order line.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of an SSIO order line.
 */
public enum SSIOOrderLineType {
  
  BUDGET("BUDGET"),
  
  PERPETUALS("PERPETUALS");

  private String value;

  SSIOOrderLineType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SSIOOrderLineType fromValue(String text) {
    for (SSIOOrderLineType b : SSIOOrderLineType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


