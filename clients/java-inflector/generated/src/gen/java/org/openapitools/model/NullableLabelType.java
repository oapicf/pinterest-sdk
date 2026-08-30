package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */
public enum NullableLabelType {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private String value;

  NullableLabelType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullableLabelType fromValue(String text) {
    for (NullableLabelType b : NullableLabelType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


