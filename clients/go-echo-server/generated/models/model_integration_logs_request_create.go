package models

// IntegrationLogsRequestCreate - Resource create operation model.
type IntegrationLogsRequestCreate struct {

	Logs []IntegrationLog `json:"logs"`
}
