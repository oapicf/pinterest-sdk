package models
// AudienceUpdateOperationType : Audience operation type (update or remove).
type AudienceUpdateOperationType string

// List of AudienceUpdateOperationType
const (
	UPDATE AudienceUpdateOperationType = "UPDATE"
	REMOVE AudienceUpdateOperationType = "REMOVE"
)
