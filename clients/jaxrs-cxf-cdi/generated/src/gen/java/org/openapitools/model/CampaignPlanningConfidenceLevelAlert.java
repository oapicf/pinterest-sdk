package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A confidence level alert for the delivery estimates provided in the response.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A confidence level alert for the delivery estimates provided in the response.")
public class CampaignPlanningConfidenceLevelAlert   {
  
  private String description;

  private CampaignPlanningConfidenceLevelAlertReason reason;

  private CampaignPlanningConfidenceLevelAlertSeverity severity;

  /**
   * Human-readable context for debugging. Not intended for display to end users.
   **/
  public CampaignPlanningConfidenceLevelAlert description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Human-readable context for debugging. Not intended for display to end users.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Reason for the confidence level alert.
   **/
  public CampaignPlanningConfidenceLevelAlert reason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "Reason for the confidence level alert.")
  @JsonProperty("reason")
  public CampaignPlanningConfidenceLevelAlertReason getReason() {
    return reason;
  }
  public void setReason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
  }


  /**
   * Severity of the confidence level alert.
   **/
  public CampaignPlanningConfidenceLevelAlert severity(CampaignPlanningConfidenceLevelAlertSeverity severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(value = "Severity of the confidence level alert.")
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

