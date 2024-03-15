package models

// AudienceDefinition - Queryable audience representation.
type AudienceDefinition struct {

	// Generation date
	Date *string `json:"date,omitempty"`

	// Generated audience type to request.
	Type string `json:"type,omitempty"`

	// Generated audience scope to request.
	Scope string `json:"scope,omitempty"`
}
