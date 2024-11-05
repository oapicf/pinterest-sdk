package models

// OauthAccessTokenResponseRefresh - A successful OAuth access token response for the refresh token flow.
type OauthAccessTokenResponseRefresh struct {

	ResponseType string `json:"response_type,omitempty"`

	AccessToken string `json:"access_token"`

	TokenType string `json:"token_type"`

	ExpiresIn int32 `json:"expires_in"`

	Scope string `json:"scope"`
}
