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

// BulkUpsertRequest - Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
type BulkUpsertRequest struct {

	Create BulkUpsertRequestCreate `json:"create,omitempty"`

	Update BulkUpsertRequestUpdate `json:"update,omitempty"`
}