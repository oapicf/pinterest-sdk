package models

// CatalogsReportParameters - Report parameters
type CatalogsReportParameters struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Report CatalogsHotelReportParametersReport `json:"report"`
}
