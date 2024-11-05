package models

type TargetingTemplateKeyword struct {

	MatchType MatchType `json:"match_type,omitempty"`

	// The keyword targeting (120 chars max).
	Value string `json:"value,omitempty"`
}
