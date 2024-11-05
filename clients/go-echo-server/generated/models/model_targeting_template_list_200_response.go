package models

type TargetingTemplateList200Response struct {

	Items []TargetingTemplateResponseData `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
