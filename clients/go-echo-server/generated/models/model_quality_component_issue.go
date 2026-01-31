package models

// QualityComponentIssue - Details of an issue with a quality component.
type QualityComponentIssue struct {

	// Unique identifier for the issue check.
	Id string `json:"id"`

	// Human-readable name of the issue.
	Name string `json:"name"`

	// Detailed reason for the issue.
	Reason string `json:"reason"`
}
