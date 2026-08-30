package models

type NumericFilterOperatorType string

// List of NumericFilterOperatorType
const (
	GREATER_THAN NumericFilterOperatorType = "GREATER_THAN"
	GREATER_THAN_OR_EQUALS NumericFilterOperatorType = "GREATER_THAN_OR_EQUALS"
	LESS_THAN NumericFilterOperatorType = "LESS_THAN"
	LESS_THAN_OR_EQUALS NumericFilterOperatorType = "LESS_THAN_OR_EQUALS"
)
