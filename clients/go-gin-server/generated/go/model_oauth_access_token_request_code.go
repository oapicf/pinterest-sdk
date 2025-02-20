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

// OauthAccessTokenRequestCode - A request to exchange an authorization code for an access token.
type OauthAccessTokenRequestCode struct {

	GrantType string `json:"grant_type"`

	Code string `json:"code"`

	RedirectUri string `json:"redirect_uri"`
}
