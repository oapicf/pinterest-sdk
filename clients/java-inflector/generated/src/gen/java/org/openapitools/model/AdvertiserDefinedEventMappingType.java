package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 */
public enum AdvertiserDefinedEventMappingType {
  
  SIGNUP("SIGNUP"),
  
  ADD_TO_CART("ADD_TO_CART"),
  
  LEAD("LEAD"),
  
  CHECKOUT("CHECKOUT"),
  
  SUBSCRIBE("SUBSCRIBE"),
  
  ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
  
  ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
  
  INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
  
  CONTACT("CONTACT"),
  
  CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
  
  FIND_LOCATION("FIND_LOCATION"),
  
  SCHEDULE("SCHEDULE"),
  
  SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
  
  START_TRIAL("START_TRIAL"),
  
  PAGE_VISIT("PAGE_VISIT"),
  
  VIEW_CATEGORY("VIEW_CATEGORY"),
  
  VIEW_CONTENT("VIEW_CONTENT"),
  
  SEARCH("SEARCH"),
  
  WATCH_VIDEO("WATCH_VIDEO");

  private String value;

  AdvertiserDefinedEventMappingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdvertiserDefinedEventMappingType fromValue(String text) {
    for (AdvertiserDefinedEventMappingType b : AdvertiserDefinedEventMappingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


