package models

type KeywordCreateItem struct {

	// **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	Bid *int32 `json:"bid,omitempty"`

	// Keyword [match type](/docs/api-features/targeting-overview/)
	MatchType *MatchType `json:"match_type"`

	// Keyword value (120 chars max).
	Value string `json:"value"`
}
