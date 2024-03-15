package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] in BETA. For update, only draft campaigns may update objective type.
 */
public enum ObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  VIDEO_VIEW("VIDEO_VIEW"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  WEB_SESSIONS("WEB_SESSIONS");

  private String value;

  ObjectiveType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ObjectiveType fromValue(String text) {
    for (ObjectiveType b : ObjectiveType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

