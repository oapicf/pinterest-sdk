package models

import (
	"gopkg.in/validator.v2"
)

// CatalogsReportParameters - Report parameters
type CatalogsReportParameters struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Report CatalogsHotelReportParametersReport `json:"report"`
}
