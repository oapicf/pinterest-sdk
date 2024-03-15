package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Status of the lead form
 */
public enum LeadFormStatus {
  
  DRAFT("DRAFT"),
  
  ACTIVE("ACTIVE");

  private String value;

  LeadFormStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LeadFormStatus fromValue(String value) {
    for (LeadFormStatus b : LeadFormStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

