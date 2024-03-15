package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static GetAudiencesOrderBy fromString(String s) {
      for (GetAudiencesOrderBy b : GetAudiencesOrderBy.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GetAudiencesOrderBy fromValue(String value) {
    for (GetAudiencesOrderBy b : GetAudiencesOrderBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


