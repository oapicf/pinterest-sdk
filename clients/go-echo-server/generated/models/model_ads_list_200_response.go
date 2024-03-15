package models

type AdsList200Response struct {

	Items []AdResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
