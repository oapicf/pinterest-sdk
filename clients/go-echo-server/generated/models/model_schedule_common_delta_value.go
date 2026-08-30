package models

type ScheduleCommonDeltaValue struct {

	AgeBucketMultipliers *ScheduleAgeBucketMultipliers `json:"age_bucket_multipliers,omitempty"`

	AppTypeMultipliers *ScheduleAppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	AudienceMultipliers ScheduleAudienceMultipliers `json:"audience_multipliers,omitempty"`

	GenderMultipliers *ScheduleBidOptionsGenderMultipliers `json:"gender_multipliers,omitempty"`

	PlacementMultipliers *ScheduleBidOptionsPlacementMultipliers `json:"placement_multipliers,omitempty"`
}
