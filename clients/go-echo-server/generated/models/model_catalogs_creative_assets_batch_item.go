package models

// CatalogsCreativeAssetsBatchItem - Creative assets batch item
type CatalogsCreativeAssetsBatchItem struct {

	Attributes CatalogsUpdatableCreativeAssetsAttributes `json:"attributes"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`
}
