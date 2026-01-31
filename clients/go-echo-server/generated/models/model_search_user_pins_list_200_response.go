package models

type SearchUserPinsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Pin `json:"items"`
}
