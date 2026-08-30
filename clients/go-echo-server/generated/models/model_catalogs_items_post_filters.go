package models

type CatalogsItemsPostFilters struct {

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty"`

	CatalogType string `json:"catalog_type"`

	ItemIds []string `json:"item_ids"`

	HotelIds []string `json:"hotel_ids"`

	CreativeAssetsIds []string `json:"creative_assets_ids"`
}
