package models
// AudienceOwnershipType : Filter audiences by ownership type.
type AudienceOwnershipType string

// List of AudienceOwnershipType
const (
	OWNED AudienceOwnershipType = "OWNED"
	RECEIVED AudienceOwnershipType = "RECEIVED"
)
