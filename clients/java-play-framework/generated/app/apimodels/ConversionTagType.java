package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * conversion tag type
 */
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
  
  EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT");

  private final String value;

  ConversionTagType(String value) {
    this.value = value;
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

