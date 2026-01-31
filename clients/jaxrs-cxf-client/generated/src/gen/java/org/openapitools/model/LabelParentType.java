package org.openapitools.model;



/**
 * Label parent entity type.
 */
public enum LabelParentType {
  
  CAMPAIGN("CAMPAIGN");

  private String value;

  LabelParentType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LabelParentType fromValue(String value) {
    for (LabelParentType b : LabelParentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

