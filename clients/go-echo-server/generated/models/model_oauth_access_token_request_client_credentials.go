package models

// OauthAccessTokenRequestClientCredentials - A request to receive a client token.
type OauthAccessTokenRequestClientCredentials struct {

	GrantType string `json:"grant_type"`

	Scope string `json:"scope"`
}
