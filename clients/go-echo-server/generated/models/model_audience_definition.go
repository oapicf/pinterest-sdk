package models

// AudienceDefinition - Queryable audience representation.
type AudienceDefinition struct {

	// Generation date
	Date *string `json:"date,omitempty"`

	Scope string `json:"scope,omitempty"`

	Type string `json:"type,omitempty"`
}
