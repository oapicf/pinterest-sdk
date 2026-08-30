package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum ProductGroupPromotionCustomizableCTAType {
  
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
  
  REGISTER_NOW("REGISTER_NOW"),
  
  FIND_A_DEALER("FIND_A_DEALER"),
  
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
  
  TRY_IT("TRY_IT"),
  
  BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE"),
  
  SHOP_ON_ADVERTISER("SHOP_ON_ADVERTISER"),
  
  SHOP_THE_COLLECTION("SHOP_THE_COLLECTION"),
  
  GET_IT_NOW("GET_IT_NOW"),
  
  TAKE_A_PEEK("TAKE_A_PEEK"),
  
  TAKE_A_CLOSER_LOOK("TAKE_A_CLOSER_LOOK");

  private String value;

  ProductGroupPromotionCustomizableCTAType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ProductGroupPromotionCustomizableCTAType fromString(String s) {
      for (ProductGroupPromotionCustomizableCTAType b : ProductGroupPromotionCustomizableCTAType.values()) {
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
  public static ProductGroupPromotionCustomizableCTAType fromValue(String value) {
    for (ProductGroupPromotionCustomizableCTAType b : ProductGroupPromotionCustomizableCTAType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


