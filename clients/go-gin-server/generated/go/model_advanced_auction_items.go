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

// AdvancedAuctionItems - Response object containing item bid options
type AdvancedAuctionItems struct {

	// Response object of item bid options
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Array with item bid options
	Items []AdvancedAuctionItem `json:"items,omitempty"`
}
