package models

// CatalogsReportParameters - Report parameters
type CatalogsReportParameters struct {

	CatalogType string `json:"catalog_type"`

	Report CatalogsHotelReportParametersReport `json:"report"`
}
