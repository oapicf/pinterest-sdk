package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Reporting targeting type for ads
 */
public enum AdsAnalyticsAdTargetingType {
  
  KEYWORD("KEYWORD"),
  
  APPTYPE("APPTYPE"),
  
  GENDER("GENDER"),
  
  LOCATION("LOCATION"),
  
  PLACEMENT("PLACEMENT"),
  
  COUNTRY("COUNTRY"),
  
  TARGETED_INTEREST("TARGETED_INTEREST"),
  
  PINNER_INTEREST("PINNER_INTEREST"),
  
  AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
  
  GEO("GEO"),
  
  AGE_BUCKET("AGE_BUCKET"),
  
  REGION("REGION"),
  
  QUIZ_RESULT("QUIZ_RESULT"),
  
  AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER");

  private final String value;

  AdsAnalyticsAdTargetingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdsAnalyticsAdTargetingType fromValue(String value) {
    for (AdsAnalyticsAdTargetingType b : AdsAnalyticsAdTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

