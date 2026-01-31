package models

type NotificationResponse struct {

	// Returns true if the notification accepted.
	Success bool `json:"success,omitempty"`

	// Received time. Unix timestamp in seconds.
	ReceivedAt int32 `json:"received_at,omitempty"`

	// error message when success is false
	ErrorMsg string `json:"error_msg,omitempty"`
}
