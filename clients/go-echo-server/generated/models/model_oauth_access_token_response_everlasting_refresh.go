package models

type OauthAccessTokenResponseEverlastingRefresh struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`

	RefreshTokenExpiresAt int32 `json:"refresh_token_expires_at"`

	ResponseType string `json:"response_type,omitempty"`

	AccessToken string `json:"access_token"`

	TokenType string `json:"token_type"`

	ExpiresIn int32 `json:"expires_in"`

	Scope string `json:"scope"`
}
