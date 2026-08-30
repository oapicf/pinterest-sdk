package models

// AiDisclosures - AI disclosure declarations the creator has made about the Pin.
type AiDisclosures struct {

	// List of AI disclosure declarations the creator has made about this Pin.
	Values []AiDisclosureItem `json:"values"`
}
