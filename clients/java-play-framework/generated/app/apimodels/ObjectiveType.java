package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
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

  private final String value;

  ObjectiveType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ObjectiveType fromValue(String value) {
    for (ObjectiveType b : ObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

