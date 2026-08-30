package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InterestsEnum
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum InterestsEnum {
  
  ALL("ALL"),
  
  ANIMALS("ANIMALS"),
  
  ARCHITECTURE("ARCHITECTURE"),
  
  ART("ART"),
  
  BEAUTY("BEAUTY"),
  
  DIY_AND_CRAFTS("DIY_AND_CRAFTS"),
  
  EDUCATION("EDUCATION"),
  
  EVENT_PLANNING("EVENT_PLANNING"),
  
  FASHION("FASHION"),
  
  FOOD_AND_DRINKS("FOOD_AND_DRINKS"),
  
  GARDENING("GARDENING"),
  
  HEALTH("HEALTH"),
  
  HOME_DECOR("HOME_DECOR"),
  
  PARENTING("PARENTING"),
  
  TRAVEL("TRAVEL"),
  
  WEDDING("WEDDING");

  private String value;

  InterestsEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static InterestsEnum fromString(String s) {
      for (InterestsEnum b : InterestsEnum.values()) {
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
  public static InterestsEnum fromValue(String value) {
    for (InterestsEnum b : InterestsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


