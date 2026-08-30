
package org.openapitools.client.model


case class CampaignPlanningConfidenceLevelAlert (
    /* Human-readable context for debugging. Not intended for display to end users. */
    _description: Option[String],
    /* Reason for the confidence level alert. */
    _reason: Option[CampaignPlanningConfidenceLevelAlertReason],
    /* Severity of the confidence level alert. */
    _severity: Option[CampaignPlanningConfidenceLevelAlertSeverity]
)
object CampaignPlanningConfidenceLevelAlert {
    def toStringBody(var_description: Object, var_reason: Object, var_severity: Object) =
        s"""
        | {
        | "description":$var_description,"reason":$var_reason,"severity":$var_severity
        | }
        """.stripMargin
}
