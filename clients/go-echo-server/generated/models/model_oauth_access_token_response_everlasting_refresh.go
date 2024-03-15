package models

// OauthAccessTokenResponseEverlastingRefresh - A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
type OauthAccessTokenResponseEverlastingRefresh struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`

	RefreshTokenExpiresAt int32 `json:"refresh_token_expires_at"`
}
