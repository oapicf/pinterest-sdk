package models

type EntityLabelError struct {

	Data EntityLabel `json:"data,omitempty"`

	ErrorMessages []string `json:"error_messages,omitempty"`
}
