package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */
public enum NullableLabelType {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private final String value;

  NullableLabelType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullableLabelType fromValue(String value) {
    for (NullableLabelType b : NullableLabelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

