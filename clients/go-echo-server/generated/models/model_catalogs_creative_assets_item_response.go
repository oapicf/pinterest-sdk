package models

// CatalogsCreativeAssetsItemResponse - Object describing a hotel record
type CatalogsCreativeAssetsItemResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes,omitempty"`
}
