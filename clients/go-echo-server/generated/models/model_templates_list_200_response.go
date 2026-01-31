package models

type TemplatesList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []TemplateResponse `json:"items"`
}
