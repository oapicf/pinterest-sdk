package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Fields that can be updated in campaign bid options.
 */
public enum CampaignBidOptionsUpdateMaskItems {
  
  AUDIENCE("AUDIENCE"),
  
  APP_TYPE("APP_TYPE"),
  
  PLACEMENT("PLACEMENT"),
  
  GENDER("GENDER"),
  
  AGE_BUCKET("AGE_BUCKET"),
  
  FREQUENCY("FREQUENCY");

  private final String value;

  CampaignBidOptionsUpdateMaskItems(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignBidOptionsUpdateMaskItems fromValue(String value) {
    for (CampaignBidOptionsUpdateMaskItems b : CampaignBidOptionsUpdateMaskItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

