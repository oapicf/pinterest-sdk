package models

type TargetingTemplateAudienceSizingReachEstimate struct {

	Estimate int64 `json:"estimate,omitempty"`

	LowerBound int64 `json:"lower_bound,omitempty"`

	UpperBound int64 `json:"upper_bound,omitempty"`
}
