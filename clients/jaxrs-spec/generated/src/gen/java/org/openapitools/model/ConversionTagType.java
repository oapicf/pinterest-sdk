package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * conversion tag type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum ConversionTagType {
  
  PAGE_LOAD("PAGE_LOAD"),
  
  UNKNOWN("UNKNOWN"),
  
  INITIALIZED("INITIALIZED"),
  
  PAGE_VISIT("PAGE_VISIT"),
  
  SIGNUP("SIGNUP"),
  
  CHECKOUT("CHECKOUT"),
  
  CUSTOM("CUSTOM"),
  
  VIEW_CATEGORY("VIEW_CATEGORY"),
  
  SEARCH("SEARCH"),
  
  ADD_TO_CART("ADD_TO_CART"),
  
  WATCH_VIDEO("WATCH_VIDEO"),
  
  LEAD("LEAD"),
  
  APP_INSTALL("APP_INSTALL"),
  
  WEB_SESSION("WEB_SESSION"),
  
  EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT"),
  
  ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
  
  ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
  
  INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
  
  SUBSCRIBE("SUBSCRIBE"),
  
  VIEW_CONTENT("VIEW_CONTENT"),
  
  ADVERTISER_DEFINED_EVENT("ADVERTISER_DEFINED_EVENT"),
  
  APP_OPEN("APP_OPEN"),
  
  CONTACT("CONTACT"),
  
  SCHEDULE("SCHEDULE"),
  
  FIND_LOCATION("FIND_LOCATION"),
  
  CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
  
  SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
  
  START_TRIAL("START_TRIAL");

  private String value;

  ConversionTagType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConversionTagType fromString(String s) {
      for (ConversionTagType b : ConversionTagType.values()) {
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
  public static ConversionTagType fromValue(String value) {
    for (ConversionTagType b : ConversionTagType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


