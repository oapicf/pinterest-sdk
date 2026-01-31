package models

type OauthAccessTokenRequestClientCredentials struct {

	Scope string `json:"scope"`

	GrantType string `json:"grant_type"`
}
