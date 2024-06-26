/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CatalogsFeedIngestionInfo struct {

	// The number of ingested products that are in stock.
	IN_STOCK int32 `json:"IN_STOCK,omitempty"`

	// The number of ingested products that are in out of stock.
	OUT_OF_STOCK int32 `json:"OUT_OF_STOCK,omitempty"`

	// The number of ingested products that are in preorder.
	PREORDER int32 `json:"PREORDER,omitempty"`
}

// AssertCatalogsFeedIngestionInfoRequired checks if the required fields are not zero-ed
func AssertCatalogsFeedIngestionInfoRequired(obj CatalogsFeedIngestionInfo) error {
	return nil
}

// AssertCatalogsFeedIngestionInfoConstraints checks if the values respects the defined constraints
func AssertCatalogsFeedIngestionInfoConstraints(obj CatalogsFeedIngestionInfo) error {
	return nil
}
