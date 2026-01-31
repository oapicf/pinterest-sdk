package models

// CampaignBidOptionsCreate - Object describing the campaign level bid multipliers.
type CampaignBidOptionsCreate struct {

	AppTypeMultipliers *AppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	AudienceMultipliers CampaignAudienceMultipliers `json:"audience_multipliers,omitempty"`

	PlacementMultipliers *PlacementMultipliers `json:"placement_multipliers,omitempty"`
}
