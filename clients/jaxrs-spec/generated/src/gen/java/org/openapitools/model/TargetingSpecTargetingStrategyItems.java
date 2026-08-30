package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecTargetingStrategyItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum TargetingSpecTargetingStrategyItems {
  
  CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
  
  FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
  
  RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

  private String value;

  TargetingSpecTargetingStrategyItems(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TargetingSpecTargetingStrategyItems fromString(String s) {
      for (TargetingSpecTargetingStrategyItems b : TargetingSpecTargetingStrategyItems.values()) {
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
  public static TargetingSpecTargetingStrategyItems fromValue(String value) {
    for (TargetingSpecTargetingStrategyItems b : TargetingSpecTargetingStrategyItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


