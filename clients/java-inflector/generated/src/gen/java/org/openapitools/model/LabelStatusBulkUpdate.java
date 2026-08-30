package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Set status to `ARCHIVED` to remove the label from the parent entity.
 */
public enum LabelStatusBulkUpdate {
  
  ARCHIVED("ARCHIVED");

  private String value;

  LabelStatusBulkUpdate(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LabelStatusBulkUpdate fromValue(String text) {
    for (LabelStatusBulkUpdate b : LabelStatusBulkUpdate.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


