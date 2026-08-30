package models
// AudienceStatus : Audience processing status
type AudienceStatus string

// List of AudienceStatus
const (
	INITIALIZING AudienceStatus = "INITIALIZING"
	READY AudienceStatus = "READY"
	TOO_SMALL AudienceStatus = "TOO_SMALL"
	ELIGIBLE AudienceStatus = "ELIGIBLE"
	PERSONAS_INELIGIBLE_SIZE AudienceStatus = "PERSONAS_INELIGIBLE_SIZE"
	PERSONAS_INITIALIZING AudienceStatus = "PERSONAS_INITIALIZING"
)
