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

type SsioOrderLinesGetByAdAccount200Response struct {

	// SSIO order lines by ad acount id
	Items []SsioOrderLine `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
