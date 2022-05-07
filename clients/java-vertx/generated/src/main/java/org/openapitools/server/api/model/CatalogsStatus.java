package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogsStatus fromValue(String value) {
    for (CatalogsStatus b : CatalogsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}