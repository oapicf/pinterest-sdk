package models

type AdAccountsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AdAccount `json:"items"`
}
