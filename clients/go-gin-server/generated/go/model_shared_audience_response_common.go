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

type SharedAudienceResponseCommon struct {

	// Audience ID that was shared
	AudienceId string `json:"audience_id,omitempty"`

	Permissions []Role `json:"permissions,omitempty"`
}
