package models

type Keywords struct {

	// Keyword error
	Errors []KeywordError `json:"errors"`

	// Keywords
	Keywords []Keyword `json:"keywords"`
}
