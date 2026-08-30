package models

// CampaignPlanningAdGroupAudienceSize - Range audience size for an ad group.
type CampaignPlanningAdGroupAudienceSize struct {

	// Lower bound of the audience size estimate.
	CountLower int32 `json:"count_lower,omitempty"`

	// Upper bound of the audience size estimate.
	CountUpper int32 `json:"count_upper,omitempty"`
}
