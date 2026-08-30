package models

// ScheduleDeltaValue - The value of the scheduled adjustment.
type ScheduleDeltaValue struct {

	AgeBucketMultipliers BidOptionsAgeBucketMultipliers `json:"age_bucket_multipliers,omitempty"`

	AppTypeMultipliers BidOptionsAppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	AudienceMultipliers []BidOptionsAudienceMultipliers `json:"audience_multipliers,omitempty"`

	GenderMultipliers BidOptionsGenderMultipliers `json:"gender_multipliers,omitempty"`

	PlacementMultipliers BidOptionsPlacementMultipliers `json:"placement_multipliers,omitempty"`
}
