package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Lead form question field type
 */
public enum LeadFormQuestionFieldType {
  
  TEXT_FIELD("TEXT_FIELD"),
  
  TEXT_AREA("TEXT_AREA"),
  
  RADIO_LIST("RADIO_LIST"),
  
  CHECKBOX("CHECKBOX"),
  
  NULL("null");

  private String value;

  LeadFormQuestionFieldType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LeadFormQuestionFieldType fromValue(String value) {
    for (LeadFormQuestionFieldType b : LeadFormQuestionFieldType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

