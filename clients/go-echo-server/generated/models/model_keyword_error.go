package models

type KeywordError struct {

	Data Keyword `json:"data,omitempty"`

	ErrorMessages []string `json:"error_messages,omitempty"`
}
