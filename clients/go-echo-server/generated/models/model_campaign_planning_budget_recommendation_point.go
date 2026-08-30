package models

// CampaignPlanningBudgetRecommendationPoint - A point estimation containing the estimate data and estimation type for a budget recommendation.
type CampaignPlanningBudgetRecommendationPoint struct {

	// Estimation type for this point.
	EstimationType CampaignPlanningEstimationType `json:"estimation_type,omitempty"`

	// Point estimate data.
	PointEstimate CampaignPlanningPointEstimate `json:"point_estimate,omitempty"`
}
