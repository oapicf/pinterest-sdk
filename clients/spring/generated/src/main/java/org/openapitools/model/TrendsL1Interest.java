package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * L1 interest categories for filtering trends.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum TrendsL1Interest {
  
  ANIMALS("animals"),
  
  ARCHITECTURE("architecture"),
  
  ART("art"),
  
  BEAUTY("beauty"),
  
  CHILDRENS_FASHION("childrens_fashion"),
  
  DESIGN("design"),
  
  DIY_AND_CRAFTS("diy_and_crafts"),
  
  EDUCATION("education"),
  
  ELECTRONICS("electronics"),
  
  ENTERTAINMENT("entertainment"),
  
  EVENT_PLANNING("event_planning"),
  
  FINANCE("finance"),
  
  FOOD_AND_DRINKS("food_and_drinks"),
  
  GARDENING("gardening"),
  
  HEALTH("health"),
  
  HOME_DECOR("home_decor"),
  
  MENS_FASHION("mens_fashion"),
  
  PARENTING("parenting"),
  
  QUOTES("quotes"),
  
  SPORT("sport"),
  
  TRAVEL("travel"),
  
  VEHICLES("vehicles"),
  
  WEDDING("wedding"),
  
  WOMENS_FASHION("womens_fashion");

  private final String value;

  TrendsL1Interest(String value) {
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
  public static TrendsL1Interest fromValue(String value) {
    for (TrendsL1Interest b : TrendsL1Interest.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

