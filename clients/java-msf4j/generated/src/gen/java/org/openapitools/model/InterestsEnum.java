package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static InterestsEnum fromValue(String text) {
    for (InterestsEnum b : InterestsEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

