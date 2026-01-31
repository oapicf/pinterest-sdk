package models

type OrderLinesList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []OrderLine `json:"items"`
}
