package models

// CatalogsCreateCreativeAssetsItem - A creative assets item to be created.
type CatalogsCreateCreativeAssetsItem struct {

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes"`
}
