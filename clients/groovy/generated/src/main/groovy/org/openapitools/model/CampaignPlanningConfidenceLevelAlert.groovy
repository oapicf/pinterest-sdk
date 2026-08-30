package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity;

@Canonical
class CampaignPlanningConfidenceLevelAlert {
    /* Human-readable context for debugging. Not intended for display to end users. */
    String description
    /* Reason for the confidence level alert. */
    CampaignPlanningConfidenceLevelAlertReason reason
    /* Severity of the confidence level alert. */
    CampaignPlanningConfidenceLevelAlertSeverity severity
}
