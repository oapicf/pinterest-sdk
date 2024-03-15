package models

type LeadFormsList200Response struct {

	Items []LeadFormResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
