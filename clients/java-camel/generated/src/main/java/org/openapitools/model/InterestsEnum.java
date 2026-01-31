package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InterestsEnum
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  private final String value;

  InterestsEnum(String value) {
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

