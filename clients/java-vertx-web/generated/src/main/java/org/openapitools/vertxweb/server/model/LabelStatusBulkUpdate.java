package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 */
public enum LabelStatusBulkUpdate {
  
  ARCHIVED("ARCHIVED");

  private String value;

  LabelStatusBulkUpdate(String value) {
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

  public static LabelStatusBulkUpdate fromValue(String value) {
    for (LabelStatusBulkUpdate b : LabelStatusBulkUpdate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}