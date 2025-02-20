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

type KeywordUpdate struct {

	// Keyword ID.
	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	// Is keyword archived?
	Archived bool `json:"archived,omitempty"`

	// </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	Bid *int32 `json:"bid,omitempty"`
}
