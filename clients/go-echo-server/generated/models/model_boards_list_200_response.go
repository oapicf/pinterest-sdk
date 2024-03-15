package models

type BoardsList200Response struct {

	// Boards
	Items []Board `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
