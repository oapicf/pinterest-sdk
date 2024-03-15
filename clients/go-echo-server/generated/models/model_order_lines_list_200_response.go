package models

type OrderLinesList200Response struct {

	Items []OrderLine `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
