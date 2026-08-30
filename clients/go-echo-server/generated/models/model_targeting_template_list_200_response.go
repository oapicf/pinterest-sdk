package models

type TargetingTemplateList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []TargetingTemplate `json:"items"`
}
