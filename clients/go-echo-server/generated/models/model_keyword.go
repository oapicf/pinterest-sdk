package models

type Keyword struct {

	Archived bool `json:"archived,omitempty"`

	// **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	Bid *int32 `json:"bid,omitempty"`

	// Keyword ID .
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// Keyword [match type](/docs/api-features/targeting-overview/)
	MatchType *MatchType `json:"match_type"`

	// Keyword parent entity ID (advertiser, campaign, ad group).
	ParentId string `json:"parent_id" validate:"regexp=^\\d+$"`

	// Parent entity type (advertiser, campaign, ad group).
	ParentType string `json:"parent_type,omitempty"`

	// Always keyword
	Type string `json:"type,omitempty"`

	// Keyword value (120 chars max).
	Value string `json:"value"`
}
