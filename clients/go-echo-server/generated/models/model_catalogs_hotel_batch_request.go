package models

// CatalogsHotelBatchRequest - Request object to update catalogs hotel items
type CatalogsHotelBatchRequest struct {

	// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	// Array with catalogs item operations
	Items []CatalogsHotelBatchItem `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`
}
