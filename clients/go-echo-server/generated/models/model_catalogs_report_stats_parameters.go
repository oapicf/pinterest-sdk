package models

// CatalogsReportStatsParameters - Report stats parameters
type CatalogsReportStatsParameters struct {

	CatalogType string `json:"catalog_type"`

	Report CatalogsHotelReportStatsParametersReport `json:"report"`
}
