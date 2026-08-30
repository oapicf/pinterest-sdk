package models

// OauthAccessToken - Describes the valid schema for possible OAuth access token requests.
type OauthAccessToken struct {

	AccessToken string `json:"access_token"`

	ExpiresIn int32 `json:"expires_in"`

	RefreshToken string `json:"refresh_token,omitempty"`

	RefreshTokenExpiresAt int32 `json:"refresh_token_expires_at,omitempty"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in,omitempty"`

	ResponseType TokenGrantType `json:"response_type,omitempty"`

	Scope string `json:"scope,omitempty"`

	TokenType string `json:"token_type"`
}
