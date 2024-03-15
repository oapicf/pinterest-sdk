package models

type CatalogsHotelItemsFilter struct {

	CatalogType string `json:"catalog_type"`

	HotelIds []string `json:"hotel_ids"`

	// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	CatalogId string `json:"catalog_id,omitempty"`
}
