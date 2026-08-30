package models

type LabelError struct {

	Data LabelErrorData `json:"data,omitempty"`

	ErrorMessages []string `json:"error_messages,omitempty"`
}
