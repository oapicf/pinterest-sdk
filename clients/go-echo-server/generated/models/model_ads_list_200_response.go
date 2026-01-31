package models

type AdsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AdResponse `json:"items"`
}
