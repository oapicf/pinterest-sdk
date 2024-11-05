package models

// CatalogsRetailReportParameters - Parameters for retail report
type CatalogsRetailReportParameters struct {

	CatalogType string `json:"catalog_type"`

	Report CatalogsHotelReportParametersReport `json:"report"`
}
