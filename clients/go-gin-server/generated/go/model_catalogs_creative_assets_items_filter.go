/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CatalogsCreativeAssetsItemsFilter struct {

	CatalogType string `json:"catalog_type"`

	CreativeAssetsIds []string `json:"creative_assets_ids"`

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`
}
