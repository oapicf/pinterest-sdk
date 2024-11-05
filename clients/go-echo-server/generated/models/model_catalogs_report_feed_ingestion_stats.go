package models

type CatalogsReportFeedIngestionStats struct {

	ReportType string `json:"report_type,omitempty"`

	// ID of the catalog entity.
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The event code that a diagnostics aggregated number references
	Code int32 `json:"code,omitempty"`

	// A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
	CodeLabel string `json:"code_label,omitempty"`

	// Title message describing the diagnostic issue
	Message string `json:"message,omitempty"`

	// Number of occurrences of the issue
	Occurrences int32 `json:"occurrences,omitempty"`

	// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
	Severity string `json:"severity,omitempty"`
}
