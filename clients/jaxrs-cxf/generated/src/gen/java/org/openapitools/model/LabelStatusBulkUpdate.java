package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LabelStatusBulkUpdate fromValue(String value) {
    for (LabelStatusBulkUpdate b : LabelStatusBulkUpdate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

