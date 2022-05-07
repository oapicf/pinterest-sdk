package models

// OauthAccessTokenRequestRefresh - A request to exchange a refresh token for a new access token.
type OauthAccessTokenRequestRefresh struct {

	RefreshToken string `json:"refresh_token"`

	Scope string `json:"scope,omitempty"`
}
