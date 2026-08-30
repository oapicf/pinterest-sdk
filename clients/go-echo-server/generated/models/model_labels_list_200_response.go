package models

type LabelsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Label `json:"items"`
}
