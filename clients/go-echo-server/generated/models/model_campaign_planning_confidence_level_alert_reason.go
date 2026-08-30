package models
// CampaignPlanningConfidenceLevelAlertReason : Reason for a confidence level alert on delivery estimates.
type CampaignPlanningConfidenceLevelAlertReason string

// List of CampaignPlanningConfidenceLevelAlertReason
const (
	UNKNOWN CampaignPlanningConfidenceLevelAlertReason = "UNKNOWN"
	OTHER CampaignPlanningConfidenceLevelAlertReason = "OTHER"
	ADVERTISER_HAS_NO_RECENT_CAMPAIGNS CampaignPlanningConfidenceLevelAlertReason = "ADVERTISER_HAS_NO_RECENT_CAMPAIGNS"
	ADVERTISER_HAS_NO_RECENT_CONVERSIONS CampaignPlanningConfidenceLevelAlertReason = "ADVERTISER_HAS_NO_RECENT_CONVERSIONS"
)
