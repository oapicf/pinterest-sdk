package models

type BoardsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Board `json:"items"`
}
