package models

type MediaList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Media `json:"items"`
}
