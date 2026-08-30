package models

// CampaignPlanningBudgetRecommendation - Budget recommendation response containing recommended budget, estimated days, and point estimations.
type CampaignPlanningBudgetRecommendation struct {

	// The recommended budget amount.
	BudgetRecommendation int32 `json:"budget_recommendation,omitempty"`

	// List of experimental budget recommendations.
	ExperimentCampaignBudgetRecommendation []CampaignPlanningExperimentBudgetRecommendation `json:"experiment_campaign_budget_recommendation,omitempty"`

	// Recommended number of days for the campaign lifetime.
	LifetimeDaysRecommendation int32 `json:"lifetime_days_recommendation,omitempty"`

	// List of point estimations for different budget scenarios.
	PointEstimations []CampaignPlanningBudgetRecommendationPoint `json:"point_estimations,omitempty"`
}
