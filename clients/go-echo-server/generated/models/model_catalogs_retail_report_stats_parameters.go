package models

// CatalogsRetailReportStatsParameters - Parameters for retail report
type CatalogsRetailReportStatsParameters struct {

	CatalogType string `json:"catalog_type"`

	Report CatalogsHotelReportStatsParametersReport `json:"report"`
}
