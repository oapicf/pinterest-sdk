package models

type OrderLineMutationError struct {

	Data OrderLine `json:"data,omitempty"`

	// Error messages.
	ErrorMessages []string `json:"error_messages,omitempty"`
}
