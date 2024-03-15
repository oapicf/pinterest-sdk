package models

// OauthAccessTokenResponseIntegrationRefresh - A successful OAuth access token response for the refresh token flow, with an added refresh token.
type OauthAccessTokenResponseIntegrationRefresh struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`
}
