package models
// NonDraftEntityStatus : Entity status
type NonDraftEntityStatus string

// List of NonDraftEntityStatus
const (
	ACTIVE NonDraftEntityStatus = "ACTIVE"
	PAUSED NonDraftEntityStatus = "PAUSED"
	ARCHIVED NonDraftEntityStatus = "ARCHIVED"
)
