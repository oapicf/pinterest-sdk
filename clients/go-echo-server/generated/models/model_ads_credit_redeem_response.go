package models

type AdsCreditRedeemResponse struct {

	// Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	Success bool `json:"success,omitempty"`

	// Error code type if error occurs
	ErrorCode *int32 `json:"errorCode,omitempty"`

	// Reason for failure
	ErrorMessage *string `json:"errorMessage,omitempty"`
}
