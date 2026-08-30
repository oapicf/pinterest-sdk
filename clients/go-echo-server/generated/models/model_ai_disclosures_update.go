package models

// AiDisclosuresUpdate - AI disclosure declarations the creator has made about the Pin.
type AiDisclosuresUpdate struct {

	// List of AI disclosure declarations the creator has made about this Pin.
	Values []AiDisclosureItem `json:"values,omitempty"`
}
