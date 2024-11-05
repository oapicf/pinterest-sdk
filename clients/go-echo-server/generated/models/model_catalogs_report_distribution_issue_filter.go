package models

type CatalogsReportDistributionIssueFilter struct {

	ReportType string `json:"report_type"`

	// Unique identifier of a catalog. If not given, oldest catalog will be used
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`
}
