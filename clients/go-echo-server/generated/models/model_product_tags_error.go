package models

// ProductTagsError - Error response for requests containing ineligible product tags.
type ProductTagsError struct {

	Code int32 `json:"code"`

	// Details about which product tags failed eligibility check.
	Details IneligibleProductTagsErrorDetails `json:"details,omitempty"`

	Message string `json:"message"`
}
