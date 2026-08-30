package models

// AdsCreditRedeem - Ads credit redemption
type AdsCreditRedeem struct {

	// Error code type if error occurs
	ErrorCode *int32 `json:"errorCode,omitempty"`

	// Reason for failure
	ErrorMessage *string `json:"errorMessage,omitempty"`

	// Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	Success bool `json:"success,omitempty"`
}
