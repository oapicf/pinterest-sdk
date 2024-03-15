package models

type BoardsListPins200Response struct {

	// Pins
	Items []Pin `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
