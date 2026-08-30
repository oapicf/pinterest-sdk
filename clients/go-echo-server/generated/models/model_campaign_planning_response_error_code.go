package models
// CampaignPlanningResponseErrorCode : Error code returned for a campaign planning estimate failure.
type CampaignPlanningResponseErrorCode string

// List of CampaignPlanningResponseErrorCode
const (
	SERVER_ERROR CampaignPlanningResponseErrorCode = "SERVER_ERROR"
	AUDIENCE_LIST_MISSING CampaignPlanningResponseErrorCode = "AUDIENCE_LIST_MISSING"
	INVALID_REQUEST CampaignPlanningResponseErrorCode = "INVALID_REQUEST"
	PRODUCT_GROUP_MISSING CampaignPlanningResponseErrorCode = "PRODUCT_GROUP_MISSING"
)
