package models

type OauthAccessTokenResponseIntegrationRefresh struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`

	AccessToken string `json:"access_token"`

	ExpiresIn int32 `json:"expires_in"`

	ResponseType string `json:"response_type,omitempty"`

	Scope string `json:"scope"`

	TokenType string `json:"token_type"`
}
