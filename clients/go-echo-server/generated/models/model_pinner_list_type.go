package models
// PinnerListType : Audience type
type PinnerListType string

// List of PinnerListType
const (
	CUSTOMER_LIST PinnerListType = "CUSTOMER_LIST"
	VISITOR PinnerListType = "VISITOR"
	ENGAGEMENT PinnerListType = "ENGAGEMENT"
	LOOKALIKE PinnerListType = "LOOKALIKE"
	ACTALIKE PinnerListType = "ACTALIKE"
	PERSONA PinnerListType = "PERSONA"
)
