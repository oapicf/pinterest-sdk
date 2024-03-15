package models

type TemplatesList200Response struct {

	Items []TemplateResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
