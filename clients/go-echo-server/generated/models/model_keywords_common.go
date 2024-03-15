package models

type KeywordsCommon struct {

	// Keyword custom bid in microcurrency - null if inherited from parent ad group.
	Bid *int32 `json:"bid,omitempty"`

	MatchType *MatchTypeResponse `json:"match_type"`

	// Keyword value (120 chars max).
	Value string `json:"value"`
}
