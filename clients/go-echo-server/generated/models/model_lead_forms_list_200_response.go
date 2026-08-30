package models

type LeadFormsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []LeadForm `json:"items"`
}
