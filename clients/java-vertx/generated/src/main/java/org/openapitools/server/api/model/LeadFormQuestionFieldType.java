package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Lead form question field type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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