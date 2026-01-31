package models

// ReportsStatsParametersParameter - Report stats parameters
type ReportsStatsParametersParameter struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Report CatalogsHotelReportStatsParametersReport `json:"report"`
}
