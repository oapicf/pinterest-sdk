package models

type AdGroupAudienceSizingKeyword struct {

	MatchType MatchType `json:"match_type"`

	// Keyword value (120 chars max).
	Value string `json:"value"`
}
