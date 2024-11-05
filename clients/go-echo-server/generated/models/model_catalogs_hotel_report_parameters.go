package models

// CatalogsHotelReportParameters - Parameters for hotel report
type CatalogsHotelReportParameters struct {

	CatalogType string `json:"catalog_type"`

	Report CatalogsHotelReportParametersReport `json:"report"`
}
