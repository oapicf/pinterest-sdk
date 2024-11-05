package models

// CatalogsDeleteCreativeAssetsItem - A creative assets item to be deleted
type CatalogsDeleteCreativeAssetsItem struct {

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`
}
