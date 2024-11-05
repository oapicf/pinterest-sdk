package models

// CatalogsUpsertCreativeAssetsItem - A creative assets item to be upserted.
type CatalogsUpsertCreativeAssetsItem struct {

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes"`
}
