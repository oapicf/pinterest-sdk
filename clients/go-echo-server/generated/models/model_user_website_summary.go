package models

type UserWebsiteSummary struct {

	// Status of the verification process
	Status string `json:"status,omitempty"`

	// UTC timestamp when the verification happened - sometimes missing
	VerifiedAt string `json:"verified_at,omitempty"`

	// Website with path or domain only
	Website string `json:"website,omitempty"`
}
