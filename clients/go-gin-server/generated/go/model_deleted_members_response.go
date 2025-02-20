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

// DeletedMembersResponse - An object with a list of members that were deleted.
type DeletedMembersResponse struct {

	// List of members whose business membership have been terminated.
	DeletedMembers []string `json:"deleted_members,omitempty"`
}
