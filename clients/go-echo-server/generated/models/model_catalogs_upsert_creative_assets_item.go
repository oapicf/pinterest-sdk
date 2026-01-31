package models

// CatalogsUpsertCreativeAssetsItem - A creative assets item to be upserted.
type CatalogsUpsertCreativeAssetsItem struct {

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`
}
