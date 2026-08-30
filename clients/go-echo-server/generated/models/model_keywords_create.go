package models

// KeywordsCreate - Resource create operation model.
type KeywordsCreate struct {

	// Keywords
	Keywords []KeywordCreateItem `json:"keywords"`

	// Keyword data
	ParentId string `json:"parent_id"`
}
