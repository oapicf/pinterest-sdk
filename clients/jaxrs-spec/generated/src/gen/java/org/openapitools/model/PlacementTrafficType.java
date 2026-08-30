package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum PlacementTrafficType {
  
  ALL("ALL"),
  
  TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
  
  FULLSCREEN_FEED("FULLSCREEN_FEED");

  private String value;

  PlacementTrafficType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static PlacementTrafficType fromString(String s) {
      for (PlacementTrafficType b : PlacementTrafficType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      return null;
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlacementTrafficType fromValue(String value) {
    for (PlacementTrafficType b : PlacementTrafficType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


