package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * bid option field to apply operation updates to
 */
public enum UpdateMaskBidOptionField {
  
  BID("BID"),
  
  APP_TYPE_BID_MULTIPLIER_SET("APP_TYPE_BID_MULTIPLIER_SET"),
  
  PLACEMENT_BID_MULTIPLIER_SET("PLACEMENT_BID_MULTIPLIER_SET");

  private final String value;

  UpdateMaskBidOptionField(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UpdateMaskBidOptionField fromValue(String value) {
    for (UpdateMaskBidOptionField b : UpdateMaskBidOptionField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

