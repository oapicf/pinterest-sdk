package models

// CampaignPlanningConfidenceLevelAlert - A confidence level alert for the delivery estimates provided in the response.
type CampaignPlanningConfidenceLevelAlert struct {

	// Human-readable context for debugging. Not intended for display to end users.
	Description string `json:"description,omitempty"`

	// Reason for the confidence level alert.
	Reason CampaignPlanningConfidenceLevelAlertReason `json:"reason,omitempty"`

	// Severity of the confidence level alert.
	Severity CampaignPlanningConfidenceLevelAlertSeverity `json:"severity,omitempty"`
}
