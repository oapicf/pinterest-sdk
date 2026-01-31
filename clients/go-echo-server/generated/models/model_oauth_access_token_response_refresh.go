package models

// OauthAccessTokenResponseRefresh - A successful OAuth access token response for the refresh token flow.
type OauthAccessTokenResponseRefresh struct {

	AccessToken string `json:"access_token"`

	ExpiresIn int32 `json:"expires_in"`

	ResponseType string `json:"response_type,omitempty"`

	Scope string `json:"scope"`

	TokenType string `json:"token_type"`

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresAt int32 `json:"refresh_token_expires_at"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`
}
