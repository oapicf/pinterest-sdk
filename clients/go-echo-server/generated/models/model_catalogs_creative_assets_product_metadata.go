package models

// CatalogsCreativeAssetsProductMetadata - Creative assets product metadata entity
type CatalogsCreativeAssetsProductMetadata struct {

	// The user-created unique ID that represents the creative assets item.
	CreativeAssetsId string `json:"creative_assets_id"`

	Visibility CreativeAssetsVisibilityType `json:"visibility"`
}
