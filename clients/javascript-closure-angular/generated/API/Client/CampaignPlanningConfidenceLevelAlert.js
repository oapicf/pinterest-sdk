goog.provide('API.Client.CampaignPlanningConfidenceLevelAlert');

/**
 * A confidence level alert for the delivery estimates provided in the response.
 * @record
 */
API.Client.CampaignPlanningConfidenceLevelAlert = function() {}

/**
 * Human-readable context for debugging. Not intended for display to end users.
 * @type {!string}
 * @export
 */
API.Client.CampaignPlanningConfidenceLevelAlert.prototype.description;

/**
 * Reason for the confidence level alert.
 * @type {!API.Client.CampaignPlanningConfidenceLevelAlertReason}
 * @export
 */
API.Client.CampaignPlanningConfidenceLevelAlert.prototype.reason;

/**
 * Severity of the confidence level alert.
 * @type {!API.Client.CampaignPlanningConfidenceLevelAlertSeverity}
 * @export
 */
API.Client.CampaignPlanningConfidenceLevelAlert.prototype.severity;

