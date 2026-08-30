package org.openapitools.model;



/**
 * Gets or Sets ChangeHistoryOperationType
 */
public enum ChangeHistoryOperationType {
  
  CREATE("CREATE"),
  
  UPDATE("UPDATE"),
  
  DELETE("DELETE");

  private String value;

  ChangeHistoryOperationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChangeHistoryOperationType fromValue(String value) {
    for (ChangeHistoryOperationType b : ChangeHistoryOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

