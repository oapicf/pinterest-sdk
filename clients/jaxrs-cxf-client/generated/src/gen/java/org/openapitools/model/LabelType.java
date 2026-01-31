package org.openapitools.model;



/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */
public enum LabelType {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private String value;

  LabelType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LabelType fromValue(String value) {
    for (LabelType b : LabelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

