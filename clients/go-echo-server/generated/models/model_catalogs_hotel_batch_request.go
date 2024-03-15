package models

// CatalogsHotelBatchRequest - Request object to update catalogs hotel items
type CatalogsHotelBatchRequest struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Country Country `json:"country"`

	Language Language `json:"language"`

	// Array with catalogs item operations
	Items []CatalogsHotelBatchItem `json:"items"`

	// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	CatalogId string `json:"catalog_id,omitempty"`
}
