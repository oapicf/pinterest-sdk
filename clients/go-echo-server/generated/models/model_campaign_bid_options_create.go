package models

// CampaignBidOptionsCreate - Object describing the campaign level bid multipliers for create operations.
type CampaignBidOptionsCreate struct {

	// Age bucket multipliers for bid adjustments.
	AgeBucketMultipliers *AgeBucketMultipliers `json:"age_bucket_multipliers,omitempty"`

	// App type multipliers for bid adjustments.
	AppTypeMultipliers *AppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	// Audience multipliers for bid adjustments.
	AudienceMultipliers CampaignAudienceMultipliers `json:"audience_multipliers,omitempty"`

	// The time window for frequency bid multipliers.
	FreqBidMultiplierTimeWindow *FreqBidMultiplierTimeWindow `json:"freq_bid_multiplier_time_window,omitempty"`

	// Frequency multipliers for bid adjustments.
	FrequencyMultipliers *FrequencyMultipliers `json:"frequency_multipliers,omitempty"`

	// Gender multipliers for bid adjustments.
	GenderMultipliers *GenderMultipliers `json:"gender_multipliers,omitempty"`

	// Placement multipliers for bid adjustments.
	PlacementMultipliers *PlacementMultipliers `json:"placement_multipliers,omitempty"`
}
