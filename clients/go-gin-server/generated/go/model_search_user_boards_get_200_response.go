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

type SearchUserBoardsGet200Response struct {

	// items
	Items []Board `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
