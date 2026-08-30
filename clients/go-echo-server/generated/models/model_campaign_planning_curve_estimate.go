package models

type CampaignPlanningCurveEstimate struct {

	// Estimation type for campaign planning estimated curve
	EstimationType CampaignPlanningEstimationType `json:"estimation_type,omitempty"`

	// The estimation points that make up the estimated curve.
	Points []CampaignPlanningPointEstimate `json:"points,omitempty"`
}
