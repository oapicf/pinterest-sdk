package models

type KeywordsResponse struct {

	Errors []KeywordError `json:"errors,omitempty"`

	Keywords []Keyword `json:"keywords,omitempty"`
}
