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
 * Severity of a confidence level alert on delivery estimates.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum CampaignPlanningConfidenceLevelAlertSeverity {
  
  UNKNOWN("UNKNOWN"),
  
  LOW_MILD("LOW_MILD"),
  
  LOW_MODERATE("LOW_MODERATE"),
  
  LOW_SEVERE("LOW_SEVERE");

  private final String value;

  CampaignPlanningConfidenceLevelAlertSeverity(String value) {
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
  public static CampaignPlanningConfidenceLevelAlertSeverity fromValue(String value) {
    for (CampaignPlanningConfidenceLevelAlertSeverity b : CampaignPlanningConfidenceLevelAlertSeverity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

