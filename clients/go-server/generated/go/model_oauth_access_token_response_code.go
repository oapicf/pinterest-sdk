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




// OauthAccessTokenResponseCode - A successful OAuth access token response for the authorization code flow.
type OauthAccessTokenResponseCode struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`
}

// AssertOauthAccessTokenResponseCodeRequired checks if the required fields are not zero-ed
func AssertOauthAccessTokenResponseCodeRequired(obj OauthAccessTokenResponseCode) error {
	elements := map[string]interface{}{
		"refresh_token": obj.RefreshToken,
		"refresh_token_expires_in": obj.RefreshTokenExpiresIn,
		"access_token": obj.AccessToken,
		"token_type": obj.TokenType,
		"expires_in": obj.ExpiresIn,
		"scope": obj.Scope,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertOauthAccessTokenResponseCodeConstraints checks if the values respects the defined constraints
func AssertOauthAccessTokenResponseCodeConstraints(obj OauthAccessTokenResponseCode) error {
	return nil
}