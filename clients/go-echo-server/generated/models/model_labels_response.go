package models

type LabelsResponse struct {

	// Labels that were not successfully applied.
	Errors []LabelError `json:"errors,omitempty"`

	Labels []Label `json:"labels,omitempty"`
}
