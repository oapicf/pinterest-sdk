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

// AudienceDefinition - Queryable audience representation.
type AudienceDefinition struct {

	// Generation date
	Date *string `json:"date,omitempty"`

	// Generated audience type to request.
	Type string `json:"type,omitempty"`

	// Generated audience scope to request.
	Scope string `json:"scope,omitempty"`
}
