package models

type Exception struct {

	// Exception error code.
	Code int32 `json:"code,omitempty"`

	// Exception message.
	Message string `json:"message,omitempty"`
}
