package models

type FilterOperatorType string

// List of FilterOperatorType
const (
	IS FilterOperatorType = "IS"
	CONTAINS FilterOperatorType = "CONTAINS"
)
