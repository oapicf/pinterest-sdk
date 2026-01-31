package models

type LabelError struct {

	Data Label `json:"data,omitempty"`

	ErrorMessages []string `json:"error_messages,omitempty"`
}
