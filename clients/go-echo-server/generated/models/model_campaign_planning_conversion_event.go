package models
// CampaignPlanningConversionEvent : Conversion event for which a conversion rate estimate is computed.
type CampaignPlanningConversionEvent string

// List of CampaignPlanningConversionEvent
const (
	SIGNUP CampaignPlanningConversionEvent = "SIGNUP"
	CHECKOUT CampaignPlanningConversionEvent = "CHECKOUT"
	ADD_TO_CART CampaignPlanningConversionEvent = "ADD_TO_CART"
	LEAD CampaignPlanningConversionEvent = "LEAD"
)
