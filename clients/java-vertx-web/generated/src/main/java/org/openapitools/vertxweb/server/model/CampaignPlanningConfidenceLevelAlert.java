package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.vertxweb.server.model.CampaignPlanningConfidenceLevelAlertSeverity;

/**
 * A confidence level alert for the delivery estimates provided in the response.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningConfidenceLevelAlert   {
  
  private String description;
  private CampaignPlanningConfidenceLevelAlertReason reason;
  private CampaignPlanningConfidenceLevelAlertSeverity severity;

  public CampaignPlanningConfidenceLevelAlert () {

  }

  public CampaignPlanningConfidenceLevelAlert (String description, CampaignPlanningConfidenceLevelAlertReason reason, CampaignPlanningConfidenceLevelAlertSeverity severity) {
    this.description = description;
    this.reason = reason;
    this.severity = severity;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("reason")
  public CampaignPlanningConfidenceLevelAlertReason getReason() {
    return reason;
  }
  public void setReason(CampaignPlanningConfidenceLevelAlertReason reason) {
    this.reason = reason;
  }

    
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
    return Objects.equals(description, campaignPlanningConfidenceLevelAlert.description) &&
        Objects.equals(reason, campaignPlanningConfidenceLevelAlert.reason) &&
        Objects.equals(severity, campaignPlanningConfidenceLevelAlert.severity);
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
