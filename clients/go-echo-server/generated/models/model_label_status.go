package models
// LabelStatus : The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
type LabelStatus string

// List of LabelStatus
const (
	ACTIVE LabelStatus = "ACTIVE"
	ARCHIVED LabelStatus = "ARCHIVED"
)
