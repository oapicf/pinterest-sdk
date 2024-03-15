package models

type PinsList200Response struct {

	Items []Pin `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
