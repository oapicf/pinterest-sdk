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

// CatalogsCreateCreativeAssetsItem - A creative assets item to be created.
type CatalogsCreateCreativeAssetsItem struct {

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id"`

	Operation string `json:"operation"`

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes"`
}
