package models

// IntegrationLogsRequest - Batch of logs sent from an integration application.
type IntegrationLogsRequest struct {

	Logs []IntegrationLog `json:"logs"`
}
