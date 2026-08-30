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
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  private final String value;

  AdvertiserDefinedEventMappingType(String value) {
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
  public static AdvertiserDefinedEventMappingType fromValue(String value) {
    for (AdvertiserDefinedEventMappingType b : AdvertiserDefinedEventMappingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

