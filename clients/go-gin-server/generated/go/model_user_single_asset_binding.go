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

// UserSingleAssetBinding - An object containing the permissions a business member/partner has on the asset.
type UserSingleAssetBinding struct {

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`

	User BusinessAccessUserSummary `json:"user,omitempty"`
}
