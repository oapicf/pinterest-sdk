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

type FeedsList200Response struct {

	Items []CatalogsFeed `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}