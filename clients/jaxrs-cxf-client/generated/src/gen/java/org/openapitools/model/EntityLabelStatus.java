package org.openapitools.model;



/**
 * Gets or Sets EntityLabelStatus
 */
public enum EntityLabelStatus {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED"),
  
  NULL("NULL");

  private String value;

  EntityLabelStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityLabelStatus fromValue(String value) {
    for (EntityLabelStatus b : EntityLabelStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

