package models

// ConversionDeletionRequestCreate - Resource create operation model.
type ConversionDeletionRequestCreate struct {

	// Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
	DeletionTargets ConversionDeletionRequestTargets `json:"deletion_targets"`
}
