package models

type BoardSectionsList200Response struct {

	// Board sections
	Items []BoardSection `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
