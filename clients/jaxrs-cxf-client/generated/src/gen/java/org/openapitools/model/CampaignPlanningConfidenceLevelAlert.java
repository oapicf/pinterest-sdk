package org.openapitools.model;

import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A confidence level alert for the delivery estimates provided in the response.
 */
@ApiModel(description="A confidence level alert for the delivery estimates provided in the response.")

public class CampaignPlanningConfidenceLevelAlert  {
  
 /**
  * Human-readable context for debugging. Not intended for display to end users.
  */
  @ApiModelProperty(value = "Human-readable context for debugging. Not intended for display to end users.")

  private String description;

 /**
  * Reason for the confidence level alert.
  */
  @ApiModelProperty(value = "Reason for the confidence level alert.")

  private CampaignPlanningConfidenceLevelAlertReason reason;

 /**
  * Severity of the confidence level alert.
  */
  @ApiModelProperty(value = "Severity of the confidence level alert.")

  private CampaignPlanningConfidenceLevelAlertSeverity severity;
 /**
   * Human-readable context for debugging. Not intended for display to end users.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CampaignPlanningConfidenceLevelAlert description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Reason for the confidence level alert.
   * @return reason
  **/
  @JsonProperty("reason")
  public CampaignPlanningConfidenceLevelAlertReason getReason() {
    return reason;
  }

  public void setReason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
  }

  public CampaignPlanningConfidenceLevelAlert reason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Severity of the confidence level alert.
   * @return severity
  **/
  @JsonProperty("severity")
  public CampaignPlanningConfidenceLevelAlertSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(CampaignPlanningConfidenceLevelAlertSeverity severity) {
    this.severity = severity;
  }

  public CampaignPlanningConfidenceLevelAlert severity(CampaignPlanningConfidenceLevelAlertSeverity severity) {
    this.severity = severity;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

