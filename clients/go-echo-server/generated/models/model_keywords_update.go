package models

// KeywordsUpdate - Resource create or update operation model.
type KeywordsUpdate struct {

	// Keywords
	Keywords []KeywordUpdateItem `json:"keywords,omitempty"`
}
