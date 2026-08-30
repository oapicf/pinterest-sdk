package org.openapitools.server.model


/**
 * A confidence level alert for the delivery estimates provided in the response.
 *
 * @param description Human-readable context for debugging. Not intended for display to end users. for example: ''null''
 * @param reason Reason for the confidence level alert. for example: ''null''
 * @param severity Severity of the confidence level alert. for example: ''null''
*/
final case class CampaignPlanningConfidenceLevelAlert (
  description: Option[String] = None,
  reason: Option[CampaignPlanningConfidenceLevelAlertReason] = None,
  severity: Option[CampaignPlanningConfidenceLevelAlertSeverity] = None
)

