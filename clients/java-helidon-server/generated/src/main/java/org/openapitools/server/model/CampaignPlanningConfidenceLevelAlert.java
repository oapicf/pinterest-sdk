package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.server.model.CampaignPlanningConfidenceLevelAlertSeverity;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A confidence level alert for the delivery estimates provided in the response.
 */
public class CampaignPlanningConfidenceLevelAlert   {

    private String description;
    private CampaignPlanningConfidenceLevelAlertReason reason;
    private CampaignPlanningConfidenceLevelAlertSeverity severity;

    /**
     * Default constructor.
     */
    public CampaignPlanningConfidenceLevelAlert() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningConfidenceLevelAlert.
     *
     * @param description Human-readable context for debugging. Not intended for display to end users.
     * @param reason Reason for the confidence level alert.
     * @param severity Severity of the confidence level alert.
     */
    public CampaignPlanningConfidenceLevelAlert(
        String description, 
        CampaignPlanningConfidenceLevelAlertReason reason, 
        CampaignPlanningConfidenceLevelAlertSeverity severity
    ) {
        this.description = description;
        this.reason = reason;
        this.severity = severity;
    }



    /**
     * Human-readable context for debugging. Not intended for display to end users.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Reason for the confidence level alert.
     * @return reason
     */
    public CampaignPlanningConfidenceLevelAlertReason getReason() {
        return reason;
    }

    public void setReason(CampaignPlanningConfidenceLevelAlertReason reason) {
        this.reason = reason;
    }

    /**
     * Severity of the confidence level alert.
     * @return severity
     */
    public CampaignPlanningConfidenceLevelAlertSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(CampaignPlanningConfidenceLevelAlertSeverity severity) {
        this.severity = severity;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

