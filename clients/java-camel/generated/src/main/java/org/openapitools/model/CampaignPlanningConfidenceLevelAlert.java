package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A confidence level alert for the delivery estimates provided in the response.
 */

@Schema(name = "CampaignPlanningConfidenceLevelAlert", description = "A confidence level alert for the delivery estimates provided in the response.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningConfidenceLevelAlert {

  private String description;

  private CampaignPlanningConfidenceLevelAlertReason reason;

  private CampaignPlanningConfidenceLevelAlertSeverity severity;

  public CampaignPlanningConfidenceLevelAlert description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable context for debugging. Not intended for display to end users.
   * @return description
   */
  
  @Schema(name = "description", description = "Human-readable context for debugging. Not intended for display to end users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CampaignPlanningConfidenceLevelAlert reason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the confidence level alert.
   * @return reason
   */
  @Valid 
  @Schema(name = "reason", description = "Reason for the confidence level alert.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public CampaignPlanningConfidenceLevelAlertReason getReason() {
    return reason;
  }

  public void setReason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
  }

  public CampaignPlanningConfidenceLevelAlert severity(CampaignPlanningConfidenceLevelAlertSeverity severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Severity of the confidence level alert.
   * @return severity
   */
  @Valid 
  @Schema(name = "severity", description = "Severity of the confidence level alert.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public CampaignPlanningConfidenceLevelAlertSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(CampaignPlanningConfidenceLevelAlertSeverity severity) {
    this.severity = severity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningConfidenceLevelAlert campaignPlanningConfidenceLevelAlert = (CampaignPlanningConfidenceLevelAlert) o;
    return Objects.equals(this.description, campaignPlanningConfidenceLevelAlert.description) &&
        Objects.equals(this.reason, campaignPlanningConfidenceLevelAlert.reason) &&
        Objects.equals(this.severity, campaignPlanningConfidenceLevelAlert.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, reason, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningConfidenceLevelAlert {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

