package models

type CatalogsItemsFilters struct {

	CatalogType CatalogsType `json:"catalog_type"`

	ItemIds []string `json:"item_ids"`

	// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	CatalogId string `json:"catalog_id,omitempty"`

	HotelIds []string `json:"hotel_ids"`
}
