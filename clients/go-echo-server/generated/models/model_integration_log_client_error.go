package models

// IntegrationLogClientError - System error details included in the log sent by the client.
type IntegrationLogClientError struct {

	// Original cause of the error.
	Cause string `json:"cause,omitempty"`

	// Column number in the line of the file that raised the error.
	ColumnNumber int32 `json:"column_number,omitempty"`

	// Filename where the error happened.
	FileName string `json:"file_name,omitempty"`

	// Line number where the error happened.
	LineNumber int32 `json:"line_number,omitempty"`

	// Human-readable description of the error.
	Message string `json:"message,omitempty"`

	// More detail about the message.
	MessageDetail string `json:"message_detail,omitempty"`

	// Filename where the error happened.
	Name string `json:"name,omitempty"`

	// Integer that specifies the error code.
	Number int32 `json:"number,omitempty"`

	// Stack trace of where the error happened.
	StackTrace string `json:"stack_trace,omitempty"`
}
