package models

type IntegrationLogsInvalidLogResponseRejectedLogsInner struct {

	// The field name containing an invalid value.
	Field string `json:"field"`

	// Index of the log in the batch.
	LogIndex int32 `json:"log_index,omitempty"`

	// The reason the value is invalid.
	Reason string `json:"reason"`

	// The value that is invalid.
	Value string `json:"value"`
}
