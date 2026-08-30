package models

// UserWebsiteCreate - Resource create operation model.
type UserWebsiteCreate struct {

	// Method used to verify website ownership.
	VerificationMethod WebsiteVerificationMethod `json:"verification_method,omitempty"`

	// Website with path or domain only
	Website string `json:"website,omitempty"`
}
