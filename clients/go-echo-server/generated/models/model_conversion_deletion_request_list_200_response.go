package models

type ConversionDeletionRequestList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []ConversionDeletionRequest `json:"items"`
}
