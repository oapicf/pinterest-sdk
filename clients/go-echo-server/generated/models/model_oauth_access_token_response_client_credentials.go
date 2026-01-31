package models

// OauthAccessTokenResponseClientCredentials - A successful OAuth client token response for the client token flow.
type OauthAccessTokenResponseClientCredentials struct {

	AccessToken string `json:"access_token"`

	ExpiresIn int32 `json:"expires_in"`

	ResponseType string `json:"response_type,omitempty"`

	Scope string `json:"scope"`

	TokenType string `json:"token_type"`
}
