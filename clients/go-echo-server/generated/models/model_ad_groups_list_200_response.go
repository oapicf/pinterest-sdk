package models

type AdGroupsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AdGroup `json:"items"`
}
