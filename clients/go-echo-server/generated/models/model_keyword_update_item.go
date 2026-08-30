package models

type KeywordUpdateItem struct {

	Archived bool `json:"archived,omitempty"`

	// **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	Bid *int32 `json:"bid,omitempty"`

	// Keyword ID .
	Id string `json:"id" validate:"regexp=^\\d+$"`
}
