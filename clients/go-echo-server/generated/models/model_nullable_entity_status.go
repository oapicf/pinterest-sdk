package models
// NullableEntityStatus : Entity status
type NullableEntityStatus string

// List of NullableEntityStatus
const (
	ACTIVE NullableEntityStatus = "ACTIVE"
	PAUSED NullableEntityStatus = "PAUSED"
	ARCHIVED NullableEntityStatus = "ARCHIVED"
	DRAFT NullableEntityStatus = "DRAFT"
	DELETED_DRAFT NullableEntityStatus = "DELETED_DRAFT"
)
