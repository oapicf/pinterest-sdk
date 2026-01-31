package models

type BoardSectionsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// Board sections
	Items []BoardSection `json:"items"`
}
