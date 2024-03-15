package models

type OrderLineError struct {

	Data OrderLine `json:"data,omitempty"`

	ErrorMessages []string `json:"error_messages,omitempty"`
}
