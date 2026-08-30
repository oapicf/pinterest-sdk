package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
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
  public static CustomerListStatus fromValue(String text) {
    for (CustomerListStatus b : CustomerListStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


