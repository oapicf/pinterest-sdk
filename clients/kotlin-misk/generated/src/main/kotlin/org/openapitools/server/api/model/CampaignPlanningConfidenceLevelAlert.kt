package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlertReason
import org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlertSeverity
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningConfidenceLevelAlert(
    /** Human-readable context for debugging. Not intended for display to end users. */
    val description: kotlin.String? = null,
    /** Reason for the confidence level alert. */
    val reason: CampaignPlanningConfidenceLevelAlertReason? = null,
    /** Severity of the confidence level alert. */
    val severity: CampaignPlanningConfidenceLevelAlertSeverity? = null
)
