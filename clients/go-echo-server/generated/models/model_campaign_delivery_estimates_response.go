package models

// CampaignDeliveryEstimatesResponse - Delivery estimates response for a campaign.
type CampaignDeliveryEstimatesResponse struct {

	// Estimated curves. Each curve will pertain to a single estimation type.
	Curves []CampaignPlanningCurveEstimate `json:"curves,omitempty"`

	DerivedMetrics CampaignDeliveryEstimatesDerivedMetrics `json:"derived_metrics,omitempty"`

	// Maximum potential spend estimate.
	MaxPotentialSpend int32 `json:"max_potential_spend,omitempty"`
}
