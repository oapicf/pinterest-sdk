package models

type AudiencesList200Response struct {

	Items []Audience `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
