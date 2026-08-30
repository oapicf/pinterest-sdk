package org.openapitools.model;



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

