package models

type CatalogsReportDistributionIssueFilter struct {

	// Unique identifier of a catalog. If not given, oldest catalog will be used
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\d+$"`

	ReportType string `json:"report_type"`
}
