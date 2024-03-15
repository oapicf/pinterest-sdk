package models

// OauthAccessTokenResponse - A successful OAuth access token response.
type OauthAccessTokenResponse struct {

	ResponseType string `json:"response_type,omitempty"`

	AccessToken string `json:"access_token"`

	TokenType string `json:"token_type"`

	ExpiresIn int32 `json:"expires_in"`

	Scope string `json:"scope"`
}
