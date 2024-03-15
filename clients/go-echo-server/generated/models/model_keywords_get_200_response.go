package models

type KeywordsGet200Response struct {

	Items []Keyword `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
