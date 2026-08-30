package models

type TemplatesList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AccountTemplate `json:"items"`
}
