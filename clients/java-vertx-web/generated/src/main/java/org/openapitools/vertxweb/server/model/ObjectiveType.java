package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. &#x60;CTV_CONSIDERATION&#x60; is in BETA. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. &#x60;CTV_CONSIDERATION&#x60; is in BETA. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 */
public enum ObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  VIDEO_COMPLETION("VIDEO_COMPLETION"),
  
  SALES("SALES"),
  
  APP_INSTALL("APP_INSTALL"),
  
  CTV_CONSIDERATION("CTV_CONSIDERATION");

  private String value;

  ObjectiveType(String value) {
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

  public static ObjectiveType fromValue(String value) {
    for (ObjectiveType b : ObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}