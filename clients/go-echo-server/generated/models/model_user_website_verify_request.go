package models

// UserWebsiteVerifyRequest - User website verification request
type UserWebsiteVerifyRequest struct {

	Website string `json:"website,omitempty"`

	VerificationMethod string `json:"verification_method,omitempty"`
}
