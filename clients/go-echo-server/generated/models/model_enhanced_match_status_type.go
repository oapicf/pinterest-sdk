package models
// EnhancedMatchStatusType : The enhanced match status of the tag
type EnhancedMatchStatusType string

// List of EnhancedMatchStatusType
const (
	UNKNOWN EnhancedMatchStatusType = "UNKNOWN"
	NOT_VALIDATED EnhancedMatchStatusType = "NOT_VALIDATED"
	VALIDATING_IN_PROGRESS EnhancedMatchStatusType = "VALIDATING_IN_PROGRESS"
	VALIDATION_COMPLETE EnhancedMatchStatusType = "VALIDATION_COMPLETE"
	NULL EnhancedMatchStatusType = "null"
)
