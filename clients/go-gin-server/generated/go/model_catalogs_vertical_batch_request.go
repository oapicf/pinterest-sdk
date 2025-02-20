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

import (
	"gopkg.in/validator.v2"
)

// CatalogsVerticalBatchRequest - A request object that can have multiple operations on a single batch
type CatalogsVerticalBatchRequest struct {

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	// Array with creative assets item operations
	Items []CatalogsCreativeAssetsBatchItem `json:"items"`

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty"`
}
