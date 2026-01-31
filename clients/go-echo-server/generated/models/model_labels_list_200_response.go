package models

type LabelsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []LabelsResponse `json:"items"`
}
