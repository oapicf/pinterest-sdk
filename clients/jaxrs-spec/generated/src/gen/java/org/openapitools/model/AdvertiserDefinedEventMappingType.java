package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AdvertiserDefinedEventMappingType fromString(String s) {
      for (AdvertiserDefinedEventMappingType b : AdvertiserDefinedEventMappingType.values()) {
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
  public static AdvertiserDefinedEventMappingType fromValue(String value) {
    for (AdvertiserDefinedEventMappingType b : AdvertiserDefinedEventMappingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


