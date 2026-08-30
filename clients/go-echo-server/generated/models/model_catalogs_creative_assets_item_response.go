package models

// CatalogsCreativeAssetsItemResponse - Object describing a creative assets item record
type CatalogsCreativeAssetsItemResponse struct {

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes,omitempty"`

	CatalogType string `json:"catalog_type"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`

	// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	ItemResponseKind string `json:"item_response_kind"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`
}
