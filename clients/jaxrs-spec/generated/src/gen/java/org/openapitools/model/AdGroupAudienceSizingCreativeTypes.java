package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdGroupAudienceSizingCreativeTypes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum AdGroupAudienceSizingCreativeTypes {
  
  REGULAR("REGULAR"),
  
  VIDEO("VIDEO"),
  
  SHOPPING("SHOPPING"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_VIDEO("MAX_VIDEO"),
  
  SHOP_THE_PIN("SHOP_THE_PIN"),
  
  COLLECTION("COLLECTION"),
  
  IDEA("IDEA");

  private String value;

  AdGroupAudienceSizingCreativeTypes(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AdGroupAudienceSizingCreativeTypes fromString(String s) {
      for (AdGroupAudienceSizingCreativeTypes b : AdGroupAudienceSizingCreativeTypes.values()) {
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
  public static AdGroupAudienceSizingCreativeTypes fromValue(String value) {
    for (AdGroupAudienceSizingCreativeTypes b : AdGroupAudienceSizingCreativeTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


