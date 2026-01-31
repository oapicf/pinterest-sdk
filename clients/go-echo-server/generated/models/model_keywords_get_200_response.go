package models

type KeywordsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Keyword `json:"items"`
}
