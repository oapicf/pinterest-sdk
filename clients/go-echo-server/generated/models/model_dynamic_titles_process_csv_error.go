package models

type DynamicTitlesProcessCsvError struct {

	// The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
	ErrorType string `json:"error_type,omitempty"`

	// The row number with a validation error. -1 indicates a file-level error.
	RowNumber int32 `json:"row_number,omitempty"`
}
