package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Error code returned for a campaign planning estimate failure.
 */
public enum CampaignPlanningResponseErrorCode {
  
  SERVER_ERROR("SERVER_ERROR"),
  
  AUDIENCE_LIST_MISSING("AUDIENCE_LIST_MISSING"),
  
  INVALID_REQUEST("INVALID_REQUEST"),
  
  PRODUCT_GROUP_MISSING("PRODUCT_GROUP_MISSING");

  private final String value;

  CampaignPlanningResponseErrorCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningResponseErrorCode fromValue(String value) {
    for (CampaignPlanningResponseErrorCode b : CampaignPlanningResponseErrorCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

