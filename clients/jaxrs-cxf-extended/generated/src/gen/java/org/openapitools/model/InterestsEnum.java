package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InterestsEnum
 */
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

