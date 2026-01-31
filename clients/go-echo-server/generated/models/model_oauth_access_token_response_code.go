package models

type OauthAccessTokenResponseCode struct {

	RefreshToken string `json:"refresh_token,omitempty"`

	RefreshTokenExpiresAt int32 `json:"refresh_token_expires_at,omitempty"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in,omitempty"`

	AccessToken string `json:"access_token"`

	ExpiresIn int32 `json:"expires_in"`

	ResponseType string `json:"response_type,omitempty"`

	Scope string `json:"scope"`

	TokenType string `json:"token_type"`
}
