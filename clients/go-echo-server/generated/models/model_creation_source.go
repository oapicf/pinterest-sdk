package models
// CreationSource : The source of conversion events ingestion
type CreationSource string

// List of CreationSource
const (
	ADS_API CreationSource = "ADS_API"
	ADS_MANAGER_REPORTING_PAGE CreationSource = "ADS_MANAGER_REPORTING_PAGE"
	ADS_MANAGER_REPORT_BUILDER CreationSource = "ADS_MANAGER_REPORT_BUILDER"
)
