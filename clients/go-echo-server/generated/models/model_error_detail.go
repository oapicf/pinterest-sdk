package models

type ErrorDetail struct {

	// Number of records with this error
	Count int32 `json:"count"`

	// Numeric error code
	ErrorCode int32 `json:"error_code"`

	// Error message description
	Message string `json:"message"`
}
