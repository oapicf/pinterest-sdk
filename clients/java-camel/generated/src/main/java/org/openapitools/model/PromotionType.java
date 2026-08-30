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
 * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum PromotionType {
  
  VARIABLE("VARIABLE"),
  
  SITEWIDE("SITEWIDE"),
  
  CHECKOUT("CHECKOUT"),
  
  SAVE_X_ON_Y("SAVE_X_ON_Y"),
  
  BUY_X_GET_Y("BUY_X_GET_Y"),
  
  SPEND_X_SAVE_Y("SPEND_X_SAVE_Y"),
  
  FREE_SHIPPING("FREE_SHIPPING"),
  
  FREE_SHIPPING_MINIMUM("FREE_SHIPPING_MINIMUM"),
  
  FREE_SHIPPING_WITH_DISCOUNT("FREE_SHIPPING_WITH_DISCOUNT"),
  
  SITEWIDE_IN_STORES("SITEWIDE_IN_STORES"),
  
  EXTRA_PERCENT_OFF("EXTRA_PERCENT_OFF"),
  
  GIFT_WITH_PURCHASE("GIFT_WITH_PURCHASE"),
  
  GIFT_WITH_PURCHASE_MINIMUM("GIFT_WITH_PURCHASE_MINIMUM"),
  
  FIXED("FIXED"),
  
  PERCENT_OFF_CLEARANCE("PERCENT_OFF_CLEARANCE"),
  
  X_OFF_Y("X_OFF_Y"),
  
  GIFT_WITH_FIRST_PURCHASE("GIFT_WITH_FIRST_PURCHASE"),
  
  BUY_X_GET_ONE_FREE("BUY_X_GET_ONE_FREE"),
  
  CASH_BACK("CASH_BACK"),
  
  POINTS_ON_ALL_PURCHASES("POINTS_ON_ALL_PURCHASES"),
  
  BONUS("BONUS"),
  
  POINTS_WITH_PURCHASE("POINTS_WITH_PURCHASE"),
  
  CUSTOM("CUSTOM");

  private final String value;

  PromotionType(String value) {
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
  public static PromotionType fromValue(String value) {
    for (PromotionType b : PromotionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

