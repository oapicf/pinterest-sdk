package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting targeting type for ads
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

  private String value;

  AdsAnalyticsAdTargetingType(String value) {
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

