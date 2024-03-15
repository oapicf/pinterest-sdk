package org.openapitools.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets GetAudiencesOrderBy
 */
public enum GetAudiencesOrderBy {
  
  NONE("NONE"),
  
  ID("ID"),
  
  SIZE("SIZE"),
  
  CREATION_DATE("CREATION_DATE"),
  
  UPDATED_TIME("UPDATED_TIME"),
  
  NAME("NAME"),
  
  STATUS("STATUS"),
  
  TYPE("TYPE");

  private String value;

  GetAudiencesOrderBy(String value) {
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

  public static GetAudiencesOrderBy fromValue(String value) {
    for (GetAudiencesOrderBy b : GetAudiencesOrderBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}