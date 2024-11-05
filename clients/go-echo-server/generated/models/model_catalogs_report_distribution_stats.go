package models

type CatalogsReportDistributionStats struct {

	ReportType string `json:"report_type,omitempty"`

	// ID of the catalog entity.
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The event code that a diagnostics aggregated number references
	Code int32 `json:"code,omitempty"`

	// A human-friendly label for the event code (e.g, 'SPAM')
	CodeLabel string `json:"code_label,omitempty"`

	// Title message describing the diagnostic issue
	Message string `json:"message,omitempty"`

	// Number of occurrences of the issue
	Occurrences int32 `json:"occurrences,omitempty"`

	// Indicates if issue makes items ineligible for ads distribution
	IneligibleForAds bool `json:"ineligible_for_ads,omitempty"`

	// Indicates if issue makes items ineligible for organic distribution
	IneligibleForOrganic bool `json:"ineligible_for_organic,omitempty"`
}
