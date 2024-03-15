package models
// AudienceType : Audience type
type AudienceType string

// List of AudienceType
const (
	CUSTOMER_LIST AudienceType = "CUSTOMER_LIST"
	VISITOR AudienceType = "VISITOR"
	ENGAGEMENT AudienceType = "ENGAGEMENT"
	ACTALIKE AudienceType = "ACTALIKE"
	PERSONA AudienceType = "PERSONA"
)
