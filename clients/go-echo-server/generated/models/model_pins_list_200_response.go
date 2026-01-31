package models

type PinsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Pin `json:"items"`
}
