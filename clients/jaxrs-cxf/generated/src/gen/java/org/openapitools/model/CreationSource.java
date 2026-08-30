package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of conversion events ingestion
 */
public enum CreationSource {
  
  ADS_API("ADS_API"),
  
  ADS_MANAGER_REPORTING_PAGE("ADS_MANAGER_REPORTING_PAGE"),
  
  ADS_MANAGER_REPORT_BUILDER("ADS_MANAGER_REPORT_BUILDER");

  private String value;

  CreationSource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CreationSource fromValue(String value) {
    for (CreationSource b : CreationSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

