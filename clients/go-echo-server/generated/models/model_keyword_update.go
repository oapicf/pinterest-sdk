package models

type KeywordUpdate struct {

	// Keyword ID.
	Id string `json:"id"`

	// Is keyword archived?
	Archived bool `json:"archived,omitempty"`

	// Keyword custom bid in microcurrency - null if inherited from parent ad group.
	Bid *int32 `json:"bid,omitempty"`
}
