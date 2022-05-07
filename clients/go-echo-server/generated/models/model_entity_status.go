package models
// EntityStatus : Entity status
type EntityStatus string

// List of EntityStatus
const (
	ACTIVE EntityStatus = "ACTIVE"
	PAUSED EntityStatus = "PAUSED"
	ARCHIVED EntityStatus = "ARCHIVED"
)
