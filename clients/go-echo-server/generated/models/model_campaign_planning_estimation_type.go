package models
// CampaignPlanningEstimationType : Estimation type for campaign planning estimated curve
type CampaignPlanningEstimationType string

// List of CampaignPlanningEstimationType
const (
	IMPRESSION CampaignPlanningEstimationType = "IMPRESSION"
	CLICK CampaignPlanningEstimationType = "CLICK"
	CONVERSION CampaignPlanningEstimationType = "CONVERSION"
	WEEKLY_FREQUENCY CampaignPlanningEstimationType = "WEEKLY_FREQUENCY"
	WEEKLY_REACH CampaignPlanningEstimationType = "WEEKLY_REACH"
	LIFETIME_FREQUENCY CampaignPlanningEstimationType = "LIFETIME_FREQUENCY"
	LIFETIME_REACH CampaignPlanningEstimationType = "LIFETIME_REACH"
	CPM CampaignPlanningEstimationType = "CPM"
	CPC CampaignPlanningEstimationType = "CPC"
	CPA CampaignPlanningEstimationType = "CPA"
)
