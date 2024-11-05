package models

// OauthAccessTokenRequestRefresh - A request to exchange a refresh token for a new access token.
type OauthAccessTokenRequestRefresh struct {

	GrantType string `json:"grant_type"`

	RefreshToken string `json:"refresh_token"`

	Scope string `json:"scope,omitempty"`

	// Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
	RefreshOn bool `json:"refresh_on,omitempty"`
}
