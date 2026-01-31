package models

type CatalogsItemsPostFilters struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty"`

	ItemIds []string `json:"item_ids"`

	HotelIds []string `json:"hotel_ids"`

	CreativeAssetsIds []string `json:"creative_assets_ids"`
}
