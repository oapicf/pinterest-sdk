package models

// CampaignPlanningPointEstimate - A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
type CampaignPlanningPointEstimate struct {

	// The budget value of the point.
	Budget int32 `json:"budget"`

	// Y value as a decimal.
	DoubleY *float64 `json:"double_y"`

	// The maximum Y value of the point.
	MaxY *int32 `json:"max_y"`

	// The minimum Y value of the point.
	MinY *int32 `json:"min_y"`

	// The expected Y value of the point.
	Y *int32 `json:"y"`
}
