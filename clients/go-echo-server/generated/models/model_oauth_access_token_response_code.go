package models

// OauthAccessTokenResponseCode - A successful OAuth access token response for the authorization code flow.
type OauthAccessTokenResponseCode struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`
}
