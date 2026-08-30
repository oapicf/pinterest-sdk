package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Estimation type for campaign planning estimated curve
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum CampaignPlanningEstimationType {
  
  IMPRESSION("IMPRESSION"),
  
  CLICK("CLICK"),
  
  CONVERSION("CONVERSION"),
  
  WEEKLY_FREQUENCY("WEEKLY_FREQUENCY"),
  
  WEEKLY_REACH("WEEKLY_REACH"),
  
  LIFETIME_FREQUENCY("LIFETIME_FREQUENCY"),
  
  LIFETIME_REACH("LIFETIME_REACH"),
  
  CPM("CPM"),
  
  CPC("CPC"),
  
  CPA("CPA");

  private final String value;

  CampaignPlanningEstimationType(String value) {
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
  public static CampaignPlanningEstimationType fromValue(String value) {
    for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

