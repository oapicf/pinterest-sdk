package models

type AdGroupsList200Response struct {

	Items []AdGroupResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
