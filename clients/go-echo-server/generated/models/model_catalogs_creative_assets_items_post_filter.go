package models

type CatalogsCreativeAssetsItemsPostFilter struct {

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\d+$"`

	CatalogType string `json:"catalog_type"`

	CreativeAssetsIds []string `json:"creative_assets_ids"`
}
