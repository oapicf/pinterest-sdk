package models

// CatalogsHotelReportStatsParameters - Parameters for hotel report
type CatalogsHotelReportStatsParameters struct {

	CatalogType string `json:"catalog_type"`

	Report CatalogsHotelReportStatsParametersReport `json:"report"`
}
