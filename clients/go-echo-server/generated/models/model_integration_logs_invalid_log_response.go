package models

// IntegrationLogsInvalidLogResponse - Schema describing the response when a log has invalid fields.
type IntegrationLogsInvalidLogResponse struct {

	RejectedLogs []IntegrationLogsInvalidLogResponseRejectedLogsInner `json:"rejected_logs,omitempty"`
}
