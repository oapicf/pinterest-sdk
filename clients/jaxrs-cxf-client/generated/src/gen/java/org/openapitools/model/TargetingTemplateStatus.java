package org.openapitools.model;



/**
 * Indicate targeting template is active or Deleted
 */
public enum TargetingTemplateStatus {
  
  ACTIVE("ACTIVE"),
  
  DELETED("DELETED");

  private String value;

  TargetingTemplateStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingTemplateStatus fromValue(String value) {
    for (TargetingTemplateStatus b : TargetingTemplateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

