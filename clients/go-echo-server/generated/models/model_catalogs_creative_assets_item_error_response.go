package models

// CatalogsCreativeAssetsItemErrorResponse - Object describing a creative assets item error
type CatalogsCreativeAssetsItemErrorResponse struct {

	CatalogType string `json:"catalog_type"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors"`

	// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	ItemResponseKind string `json:"item_response_kind"`
}
