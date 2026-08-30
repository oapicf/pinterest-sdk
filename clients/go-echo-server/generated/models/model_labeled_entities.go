package models

type LabeledEntities struct {

	EntitiesLabels []EntityLabel `json:"entities_labels,omitempty"`

	// Labels that were not successfully applied.
	Errors []EntityLabelError `json:"errors,omitempty"`
}
