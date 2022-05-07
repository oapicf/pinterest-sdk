package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */
public enum CatalogsStatus {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE");

  private String value;

  CatalogsStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsStatus fromValue(String value) {
    for (CatalogsStatus b : CatalogsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

