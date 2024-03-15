package models

type CustomerListsList200Response struct {

	Items []CustomerList `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
