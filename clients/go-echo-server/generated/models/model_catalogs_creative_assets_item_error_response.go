package models

// CatalogsCreativeAssetsItemErrorResponse - Object describing a creative assets item error
type CatalogsCreativeAssetsItemErrorResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors,omitempty"`
}
