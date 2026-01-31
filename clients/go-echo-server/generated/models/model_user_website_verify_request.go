package models

// UserWebsiteVerifyRequest - User website verification request
type UserWebsiteVerifyRequest struct {

	VerificationMethod string `json:"verification_method,omitempty"`

	Website string `json:"website,omitempty"`
}
