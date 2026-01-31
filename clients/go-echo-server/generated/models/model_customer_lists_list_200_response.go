package models

type CustomerListsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CustomerList `json:"items"`
}
