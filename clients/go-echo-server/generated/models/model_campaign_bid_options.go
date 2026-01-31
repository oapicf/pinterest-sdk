package models

// CampaignBidOptions - Object describing the campaign level bid multipliers.
type CampaignBidOptions struct {

	AppTypeMultipliers *AppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	AudienceMultipliers CampaignAudienceMultipliers `json:"audience_multipliers,omitempty"`

	PlacementMultipliers *PlacementMultipliers `json:"placement_multipliers,omitempty"`
}
