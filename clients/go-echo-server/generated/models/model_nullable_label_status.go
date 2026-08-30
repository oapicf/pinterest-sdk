package models
// NullableLabelStatus : The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
type NullableLabelStatus string

// List of NullableLabelStatus
const (
	ACTIVE NullableLabelStatus = "ACTIVE"
	ARCHIVED NullableLabelStatus = "ARCHIVED"
)
