package models

type BoardsListPins200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// Pins
	Items []Pin `json:"items"`
}
