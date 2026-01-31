package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 */
public enum CustomizableCTAType {
  
  GET_OFFER("GET_OFFER"),
  
  LEARN_MORE("LEARN_MORE"),
  
  ORDER_NOW("ORDER_NOW"),
  
  SHOP_NOW("SHOP_NOW"),
  
  SIGN_UP("SIGN_UP"),
  
  SUBSCRIBE("SUBSCRIBE"),
  
  BUY_NOW("BUY_NOW"),
  
  CONTACT_US("CONTACT_US"),
  
  GET_QUOTE("GET_QUOTE"),
  
  VISIT_SITE("VISIT_SITE"),
  
  APPLY_NOW("APPLY_NOW"),
  
  BOOK_NOW("BOOK_NOW"),
  
  REQUEST_DEMO("REQUEST_DEMO"),
  
  REGISTER_NOW("REGISTER_NOW"),
  
  FIND_A_DEALER("FIND_A_DEALER"),
  
  ADD_TO_CART("ADD_TO_CART"),
  
  WATCH_NOW("WATCH_NOW"),
  
  READ_MORE("READ_MORE"),
  
  BUY_TICKETS("BUY_TICKETS"),
  
  DONATE_NOW("DONATE_NOW"),
  
  DOWNLOAD("DOWNLOAD"),
  
  EXPLORE_MORE("EXPLORE_MORE"),
  
  FIND_A_LOCATION("FIND_A_LOCATION"),
  
  GET_DEAL("GET_DEAL"),
  
  GET_RECIPE("GET_RECIPE"),
  
  GET_SHOWTIMES("GET_SHOWTIMES"),
  
  ON_SALE("ON_SALE"),
  
  PLAY_GAME("PLAY_GAME"),
  
  TRY_IT("TRY_IT");

  private String value;

  CustomizableCTAType(String value) {
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

  public static CustomizableCTAType fromValue(String value) {
    for (CustomizableCTAType b : CustomizableCTAType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}