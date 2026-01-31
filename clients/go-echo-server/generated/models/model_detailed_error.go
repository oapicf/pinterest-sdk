package models

// DetailedError - Used for including extra details to a base error
type DetailedError struct {

	Code int32 `json:"code"`

	Details map[string]interface{} `json:"details"`

	Message string `json:"message"`
}
