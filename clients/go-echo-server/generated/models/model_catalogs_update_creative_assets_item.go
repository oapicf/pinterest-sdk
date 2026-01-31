package models

// CatalogsUpdateCreativeAssetsItem - A creative assets item to be updated.
type CatalogsUpdateCreativeAssetsItem struct {

	Attributes CatalogsUpdatableCreativeAssetsAttributes `json:"attributes"`

	// The catalog creative assets item id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`
}
