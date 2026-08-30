package models

type BoardsListPins200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []PinRead `json:"items"`
}
