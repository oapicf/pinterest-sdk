package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
 */
public enum AudienceSharingType {
  
  CUSTOM("CUSTOM"),
  
  SYNDICATED("SYNDICATED");

  private String value;

  AudienceSharingType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceSharingType fromValue(String value) {
    for (AudienceSharingType b : AudienceSharingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

