package apimodels;

import apimodels.CampaignPlanningConfidenceLevelAlertReason;
import apimodels.CampaignPlanningConfidenceLevelAlertSeverity;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A confidence level alert for the delivery estimates provided in the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningConfidenceLevelAlert   {
  @JsonProperty("description")
  
  private String description;

  @JsonProperty("reason")
  @Valid

  private CampaignPlanningConfidenceLevelAlertReason reason;

  @JsonProperty("severity")
  @Valid

  private CampaignPlanningConfidenceLevelAlertSeverity severity;

  public CampaignPlanningConfidenceLevelAlert description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Human-readable context for debugging. Not intended for display to end users.
   * @return description
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

