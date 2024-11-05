package models

import (
	"gopkg.in/validator.v2"
)

type CatalogsItemsPostFilters struct {

	CatalogType CatalogsType `json:"catalog_type"`

	ItemIds []string `json:"item_ids"`

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty"`

	HotelIds []string `json:"hotel_ids"`

	CreativeAssetsIds []string `json:"creative_assets_ids"`
}
