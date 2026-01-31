package models

type LeadFormsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []LeadFormResponse `json:"items"`
}
