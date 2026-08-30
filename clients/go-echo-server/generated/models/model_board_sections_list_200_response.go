package models

type BoardSectionsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []BoardSection `json:"items"`
}
