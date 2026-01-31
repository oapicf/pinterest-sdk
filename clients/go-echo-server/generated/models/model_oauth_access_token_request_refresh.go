package models

type OauthAccessTokenRequestRefresh struct {

	RefreshToken string `json:"refresh_token"`

	Scope string `json:"scope,omitempty"`

	GrantType string `json:"grant_type"`
}
